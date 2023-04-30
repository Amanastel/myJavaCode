package com.masai.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class Student {
    private int roll;
    private String name;
    private String address;
//    @JsonIgnore
    private int marks;


    public Student(){

    }

    public Student(int roll, String name, String address, int marks) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getRoll() == student.getRoll() && getMarks() == student.getMarks() && Objects.equals(getName(), student.getName()) && Objects.equals(getAddress(), student.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoll(), getName(), getAddress(), getMarks());
    }
}
