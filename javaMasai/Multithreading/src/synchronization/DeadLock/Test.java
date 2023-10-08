package synchronization.DeadLock;

public class Test {
    public static Object object = new Object();
    public static Object object2 = new Object();

    public static void main(String[] args) {

        String lock1 = "lock1";
        String lock2 = "lock2";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("Thread 1: Holding lock 1...");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Thread 1: Waiting for lock 2...");
                    synchronized (lock2) {
                        System.out.println("Thread 1: Holding lock 1 & 2...");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println("Thread 2: Holding lock 2...");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Thread 2: Waiting for lock 1...");
                    synchronized (lock1) {
                        System.out.println("Thread 2: Holding lock 1 & 2...");
                    }
                }
            }
        });

        t1.start();
        t2.start();


    }

}
