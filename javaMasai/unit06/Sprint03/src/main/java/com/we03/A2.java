package com.we03;

public class A2 {
    private String message;
    public void setMessage(String message) {
        this.message = message;
    }

    public void mySetup() {

        System.out.println("inside mySetup method to write any initialization logic...");
        System.out.println("message is :"+message);
    }

    public void funA() {
        System.out.println("inside funA of A");
    }

}
