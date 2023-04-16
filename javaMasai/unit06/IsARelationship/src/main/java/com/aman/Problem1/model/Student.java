package com.aman.Problem1.model;

import javax.persistence.*;

//@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentRoll;

    private String studentName;

    private String mobileNumber;

    private String email;

    @ManyToOne
    @JoinColumn(name = "collageId")
    private Collage collage;

    public Student(int studentRoll, String studentName, String mobileNumber, String email, Collage collage) {
        this.studentRoll = studentRoll;
        this.studentName = studentName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.collage = collage;
    }

    public Student() {
    }

    public int getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collage getCollage() {
        return collage;
    }

    public void setCollage(Collage collage) {
        this.collage = collage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentRoll=" + studentRoll +
                ", studentName='" + studentName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
