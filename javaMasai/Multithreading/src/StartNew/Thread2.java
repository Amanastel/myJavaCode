package StartNew;

public class Thread2 implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        for(int i=0 ; i<10; i++){
            System.out.println("Thread 2 : "+i);
        }
    }
}
