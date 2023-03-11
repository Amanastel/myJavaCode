package Multithreading.com;


class MyThread extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<10000){
            System.out.println("my Thread is Running");
            System.out.println("I am happy!");
            i++;
        }

    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<10000){
            System.out.println("Thread 2 is Running");
            System.out.println("I am Good!");
            i++;
        }

    }
}

public class Demo01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
