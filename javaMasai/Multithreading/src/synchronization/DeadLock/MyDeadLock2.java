package synchronization.DeadLock;

public class MyDeadLock2 {
    public void fun2(){

        synchronized (Test.object2){
            synchronized (Test.object){

            }
        }
    }
}
