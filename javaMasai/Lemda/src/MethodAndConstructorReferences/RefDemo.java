package MethodAndConstructorReferences;

import MethodAndConstructorReferences.com.Stuff;

public class RefDemo {
    public static void main(String[] args) {
        System.out.println("Learning Method references");

//        WorkInter workInter=()->{
//            System.out.println("this is do task new method ");
//        };

        // static method ko refer kiya hai
        // className::methodName
        WorkInter workInter = Stuff::doSuff;
        workInter.doTask();  // this line of code refer the all code where i write doStuff static


        Runnable runnable = Stuff::threadTask;


        WorkInter workInter1 = Stuff::threadTask;
        workInter1.doTask();


        Thread d = new Thread(runnable);
        d.start();


        Stuff ob = new Stuff();
        Runnable runnable1 = ob::printNumber;
        Thread d2 = new Thread(runnable1);
        d2.start();
//        runnable1.run();

    }
}
