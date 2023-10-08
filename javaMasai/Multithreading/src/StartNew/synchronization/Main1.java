package StartNew.synchronization;

class Main1{
    public static void main(String[] args){
        Common c=new Common();
//sharing same Common object to two thread
        ThreadA t1=new ThreadA(c,"Ram");
        ThreadB t2=new ThreadB(c,"Shyam");
        t1.start();
        t2.start();
    }
}

