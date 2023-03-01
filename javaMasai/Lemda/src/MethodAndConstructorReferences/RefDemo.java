package MethodAndConstructorReferences;

import MethodAndConstructorReferences.com.Stuff;

public class RefDemo {
    public static void main(String[] args) {
        System.out.println("Learning Method references");

//        WorkInter workInter=()->{
//            System.out.println("this is do task new method ");
//        };
        WorkInter workInter = Stuff::doSuff;
        workInter.doTask();
    }
}
