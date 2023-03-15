package synchronization;

class msg{
    public void show(String name){
                            //Home
        ;;;;; // 100 LOC
        synchronized (this){
            for(int i=1; i<=3; i++){
                System.out.println("How are U "+name);
            }
        }
        ;;;;; // 100 LOC
                            // School
    }
}

class OurThread extends Thread{
    msg m;
    String name;
    OurThread(msg m, String name){
        this.m = m;
        this.name=name;
    }
    public void run(){
        m.show(name);
    }
}
public class BridgeSynBlock {
    public static void main(String[] args) {
        msg m = new msg();
        OurThread t1 = new OurThread(m, "akhilesh");
        OurThread t2 = new OurThread(m, "ankush");
        t1.start();
        t2.start();
    }
}
