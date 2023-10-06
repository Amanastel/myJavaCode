package StartNew;

public class ThreadTester {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
        

        Thread thread2 = new Thread(new Thread2());
        thread2.start();
    }
}
