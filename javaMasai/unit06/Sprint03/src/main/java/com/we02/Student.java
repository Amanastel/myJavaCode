package com.we02;

public class Student {
    private int roll;
    private String name;
    private int marks;


    //constructor injection point
    public Student(int roll, String name, int marks) {
        super();
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }


    public void displayDetails() {
        System.out.println("Roll is :"+roll);
        System.out.println("Name is :"+name);
        System.out.println("Marks is :"+marks);
    }
}
