package com.we02;

import java.util.Arrays;

public class A {
    //normal array type dependency
    private String[] names;

    public void setNames(String[] names) {
        this.names = names;
    }



    public void show() {

        System.out.println("inside showA of A ");
        System.out.println(Arrays.toString(names));


    }
}
