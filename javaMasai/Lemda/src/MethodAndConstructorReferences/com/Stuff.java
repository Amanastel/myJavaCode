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

}
