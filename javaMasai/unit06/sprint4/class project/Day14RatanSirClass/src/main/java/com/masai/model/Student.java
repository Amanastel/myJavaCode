package com.masai.model;

public class Student {

    private Integer Roll;
    private String Name;
    private String Address;
    private Integer Marks;

    public Student() {
    }

    public Student(Integer roll, String name, String address, Integer marks) {
        Roll = roll;
        Name = name;
        Address = address;
        Marks = marks;
    }

    public Integer getRoll() {
        return Roll;
    }

    public void setRoll(Integer roll) {
        Roll = roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Integer getMarks() {
        return Marks;
    }

    public void setMarks(Integer marks) {
        Marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Roll=" + Roll +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Marks=" + Marks +
                '}';
    }
}
