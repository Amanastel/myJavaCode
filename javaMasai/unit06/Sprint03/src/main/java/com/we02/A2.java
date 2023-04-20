package com.we02;

import java.util.Set;

public class A2 {
    private Set<String> theSet;

    public void setTheSet(Set<String> theSet) {
        this.theSet = theSet;
    }


    public void show() {

        System.out.println("inside showA of A ");
        System.out.println(theSet);

    }
}
