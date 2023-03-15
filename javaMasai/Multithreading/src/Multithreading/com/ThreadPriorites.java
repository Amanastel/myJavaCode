package Multithreading.com;


class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    @Override
    public void run(){
        int i = 34;

        while (i>0){
            System.out.println("Thank you "+ this.getName());
            i--;
        }
    }

}
public class ThreadPriorites {
    public static void main(String[] args) {
//        Raddy Queue: T1 T2 T3 T4 T5

        MyThr1 t1 = new MyThr1("Aman1");
        MyThr1 t2 = new MyThr1("Aman2");
        MyThr1 t3 = new MyThr1("Aman3");
        MyThr1 t4 = new MyThr1("Aman4");
        MyThr1 t5 = new MyThr1("Aman5 (Most impotent)");

//        t5.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(10);
//        t4.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(1);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
        t4.start();
        t5.start();


    }
}
