package StartNew;

public class Thread1 extends Thread{

    @Override
    public void run(){

        for(int i=0; i<10; i++) {
            System.out.println("inside the thread 1: "+i);
        }

    }

}

class Main extends Thread {
    public void run() {
        System.out.println("Inside run method");
    }
}