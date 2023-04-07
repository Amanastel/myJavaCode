package Day6Assignment;

public class Problem1 {
    public static void main(String[] args) throws InterruptedException {
        Thread evenThread = new Thread(new EvenNumbers());
        Thread oddThread = new Thread(new OddNumbers());

        
        evenThread.start();
        oddThread.start();

        
        evenThread.join();
        oddThread.join();

        System.out.println("All even and odd numbers printed.");
    }

}
class EvenNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
class OddNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}