package MethodAndConstructorReferences.com;

import java.time.LocalDate;

public class Stuff {
    public static void doSuff(){
        System.out.println("I am doing task");


        // if write a line of code it will all refer the same code.
        System.out.println("I am second Line");
        LocalDate now = LocalDate.now();
        System.out.println(now);
    }


    public static void threadTask(){
        int n = 10;
        for(int i=1; i<=n; i++){
            System.out.println(i*2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
    }


    // this is a none static method we can not call directly
    public void printNumber(){
        int n = 10;
        for(int i=1; i<=n; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
    }

}
