package com.masai;

public class MyBusinessClass {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fun1() {
        System.out.println("inside fun1 ");
        System.out.println("injected age "+ age);
        System.out.println("injected name "+ name);
    }
}
