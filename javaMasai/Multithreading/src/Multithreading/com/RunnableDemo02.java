package Multithreading.com;


class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<20; i++){
            System.out.println("I am a Thread 1 not a thread1");
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<20; i++){
            System.out.println("I am a Thread 2 not a thread2");
        }
    }
}
public class RunnableDemo02 {
    public static void main(String[] args) {
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
