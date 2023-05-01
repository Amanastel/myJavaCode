package com.masai.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roll;
    private String name;
    private Integer marks;
    @Embedded
    private Address address;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Course> courses = new HashSet<>();


//    public Student(Integer roll, String name, Integer marks, Address address, Set<Course> courses) {
//        this.roll = roll;
//        this.name = name;
//        this.marks = marks;
//        this.address = address;
//        this.courses = courses;
//    }
//
//    public Student() {
//    }


    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getRoll(), student.getRoll()) && Objects.equals(getName(), student.getName()) && Objects.equals(getMarks(), student.getMarks()) && Objects.equals(getAddress(), student.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoll(), getName(), getMarks(), getAddress());
    }
}
