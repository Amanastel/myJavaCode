package com.company;
class Student {
    String name;
    String cast;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.cast);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
        this.cast = s2.cast;
    }

    Student() {

    }
}

public class CopyConstructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 23;
        s1.cast = "nishad";

        Student s2 = new Student(s1);
        s2.printInfo();

       // System.out.println(s1.name);

    }
}




