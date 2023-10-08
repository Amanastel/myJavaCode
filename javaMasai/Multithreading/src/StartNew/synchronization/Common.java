package StartNew.synchronization;

public class Common {
    public void fun1(String name) {
        System.out.print("Welcome");
        try {
            Thread.sleep(1000);
        } catch (Exception ee) {
        }
        System.out.println(name);
    }
}
