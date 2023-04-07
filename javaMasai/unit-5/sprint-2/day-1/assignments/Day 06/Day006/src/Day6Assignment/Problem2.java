package Day6Assignment;
public class Problem2 {
    private static final int MAX = 20;
    private static final Object lock = new Object();
    private static boolean isSalman = true;

    public static void main(String[] args) {
        
        Thread salmanThread = new Thread(new SalmanThread());
        Thread hritikThread = new Thread(new HritikThread());

      
        salmanThread.start();
        hritikThread.start();
    }

    static class SalmanThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i <= MAX; i += 2) {
                synchronized (lock) {
                    while (!isSalman) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(i + " ");
                    isSalman = false;
                    lock.notifyAll();
                }
            }
        }
    }

    static class HritikThread implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= MAX; i += 2) {
                synchronized (lock) {
                    while (isSalman) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(i + " ");
                    isSalman = true;
                    lock.notifyAll();
                }
            }
        }
    }
}
