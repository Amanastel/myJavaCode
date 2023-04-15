package com.masai.associationmapping.OneToOneUni;

import javax.persistence.*;

//@Entity
public class Employee {
    @Id
    @Column(name = "imp_id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empID;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imp_id")
    private EmployeeDetails employeeDetails;


    public Employee(int empID, String name, EmployeeDetails employeeDetails) {
        this.empID = empID;
        this.name = name;
        this.employeeDetails = employeeDetails;
    }

    public Employee() {
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", employeeDetails=" + employeeDetails +
                '}';
    }
}
