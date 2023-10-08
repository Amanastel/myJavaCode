package StartNew.synchronization;

class Main implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("inside run " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("end of run()...");
    }
    public static void main(String[] args) {
        Main job = new Main();
        Thread t1 = new Thread(job);
        t1.start();
        System.out.println("end of main()...");


    }
}