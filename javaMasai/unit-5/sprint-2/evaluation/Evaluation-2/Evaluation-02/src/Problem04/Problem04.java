package Problem04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class Problem04 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxNum = 5;
        int maxNumValue = 5;
//        int add = 0;
        AtomicInteger totalSum = new AtomicInteger();
        Thread proThread = new Thread(()->{
            for(int i=0; i<maxNum; i++){
                int sum = (int) (Math.random() * (maxNumValue +1));
                synchronized (queue){
                    queue.add(sum);
                    System.out.println("Producer Produced:  "+ sum);
                    queue.notifyAll();
                }
            }
        });
        Thread consumerThread = new Thread(()->{
            while (true){
                int num =0 ;
                synchronized (queue){
                    while (queue.isEmpty()){
                        try {
                            queue.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    num = queue.poll();
                }
                int add = num;
                totalSum.addAndGet(num);
                System.out.println("Consumer Calculated Sum is: "+ totalSum);
                if(totalSum.get() >= maxNum * maxNumValue){
                    break;
                }
            }
        });
        proThread.start();

        try {
            proThread.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        consumerThread.start();
        try {
            consumerThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
