package Multithreading.com;


class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while (true){
//            System.out.println("I am a thread");
//        }
    }

}
public class ThreadConstructor {
    public static void main(String[] args) {
        MyThr thr = new MyThr("Aman");
        MyThr thr2 = new MyThr("anshika");
        thr.start();
        thr2.start();
        System.out.println("the id is the thread " + thr.getId());
        System.out.println("the id is the thread " + thr.getName());

        System.out.println("the id is the thread " + thr2.getId());
        System.out.println("the id is the thread " + thr2.getName());
    }
}
