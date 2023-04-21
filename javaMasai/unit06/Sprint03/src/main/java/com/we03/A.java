package com.we03;

import java.util.Map;

public class A {
    private Map<Student, String> theMap;


    public void setTheMap(Map<Student,String> theMap) {
        this.theMap = theMap;
    }




    public void show() {

        System.out.println("inside showA of A ");

        System.out.println(theMap);

    }
}
