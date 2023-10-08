package synchronization.DeadLock;

public class MyDeadLock {
    public void fun(){
        synchronized (Test.object){
            synchronized (Test.object2){

            }
        }
    }

}
