package Multithreading.com;

import java.io.IOException;

class MyNewThread extends Thread{
    public void run(){
        int i=0;
        while (i<12){
            System.out.println("Thank You: ");
            i++;
        }
    }
}
class MyNewThread2 extends Thread{
    public void run(){
        int i=0;
        while (i<20){
            System.out.println("Thank You: thread2");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
public class ThreadMethod {
    public static void main(String[] args) {
        MyNewThread t1 =  new MyNewThread();
        MyNewThread2 t2 =  new MyNewThread2();
        t1.start();

        try {
          t1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
