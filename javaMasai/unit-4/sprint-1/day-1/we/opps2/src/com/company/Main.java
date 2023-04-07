package com.company;


//  polymorphism
//class Student {
//    String name;
//    int age;
//    public void info(String name) {
//        System.out.println(name);
//    }
//    public void info(int age) {
//        System.out.println(age);
//    }
//    public void info(String name, int age) {
//        System.out.println(name+ " " +age);
//
//    }
//}
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//
//        Student s1 = new Student();
//        s1.name = "aman";
//        s1.age = 23;
//        s1.info( s1.name ,s1.age);
//    }
//}

//inheritance

class Shape {
    String color;
}

class Triangle extends Shape {

    public void info(String color) {
        System.out.println(this.color);
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.info(t1.color);
    }
}