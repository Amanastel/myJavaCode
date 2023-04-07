package com.company;

class Aman {
    String name;
    String cast;
    int age;


    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name, int age) {
        System.out.println(name +" "+ age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Aman s1 = new Aman();
        s1.name = "aman";
        s1.age = 23;
        s1.cast = "nishad";

        s1.printInfo(s1.name, s1.age);
    }
}
