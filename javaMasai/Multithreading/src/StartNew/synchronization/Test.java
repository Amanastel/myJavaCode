package StartNew.synchronization;

class Test{
    public static void main(String[] args){
        Common c1=new Common();
        Common c2=new Common();
        ThreadA t1=new ThreadA(c1,"Ram");
        ThreadB t2=new ThreadB(c2,"Shyam");
        t1.start();
        t2.start();
    }
}