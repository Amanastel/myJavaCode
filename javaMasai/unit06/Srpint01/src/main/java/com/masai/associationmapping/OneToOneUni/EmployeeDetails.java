package com.masai.associationmapping.OneToOneUni;

import javax.persistence.*;

//@Entity
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detailID;

    private String state;
    private int age;
    private int empID;

    public EmployeeDetails(int detailID, String state, int age, int empID) {
        this.detailID = detailID;
        this.state = state;
        this.age = age;
        this.empID = empID;
    }

    public int getDetailID() {
        return detailID;
    }

    public void setDetailID(int detailID) {
        this.detailID = detailID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public EmployeeDetails() {
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "detailID=" + detailID +
                ", state='" + state + '\'' +
                ", age=" + age +
                ", empID=" + empID +
                '}';
    }
}
