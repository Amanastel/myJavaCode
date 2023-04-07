package Problem01;

class Virat implements Runnable{
    @Override
    public void run() {
        int sum = 0;
        for(int i=1; i<=20; i++){
            sum+=i;
        }
        System.out.println("Sum of first 20 Number "+ sum);
    }
}

class Dhoni implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for(int i=1; i<=10; i++){
            System.out.println("Dhoni thread Prints "+ i);
        }
    }
}

class Rohit implements Runnable{

    @Override
    public void run() {
        int pro = 1;
        for(int i=1; i<=10; i++){
            pro *=i;
        }
        System.out.println("Product of first 10 Number "+ pro);
    }
}
public class Problem01 {
    public static void main(String[] args) {
        Thread viratThread = new Thread(new Virat(), "Virat");
        Thread dhoniThread = new Thread(new Dhoni(), "Dhoni");
        Thread rohitThread = new Thread(new Rohit(), "Rohit");


        dhoniThread.start();
        try {
            dhoniThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        viratThread.start();
        try {
            dhoniThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        rohitThread.start();
        try {
            dhoniThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
