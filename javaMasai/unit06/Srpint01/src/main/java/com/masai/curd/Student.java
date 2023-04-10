package com.masai.curd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "rollNo")
    private int id;

    private String name;

    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "rollNumber=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
