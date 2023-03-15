package synchronization;

class Bank extends Thread{
    static int bal = 5000;
    static int withdraw;
    Bank(int withdraw){
        this.withdraw = withdraw;
    }
    public static synchronized void Withdraw(){
        String name = Thread.currentThread().getName();
        if(withdraw<=bal){
            System.out.println(name+" withdraw money "+withdraw);
            bal = bal-withdraw;
        }else{
            System.out.println(name+" Insufficient Balance");
        }
        System.out.println("available balance "+ bal);

    }
    public void run(){
        Withdraw();
        System.out.println();
    }
}

public class BanCustomer {
    public static void main(String[] args) {
        Bank obj = new Bank(5000); // obj has one lock

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setName("Raju");
        t2.setName("Sunita");
        t1.start();
        t2.start();


        Bank obj2 = new Bank(5000); // obj has one lock
        Thread t3 = new Thread(obj2);
        Thread t4 = new Thread(obj2);
        t3.setName("rahul");
        t4.setName("Anita");
        t3.start();
        t4.start();

        // code is not correct
    }
}
