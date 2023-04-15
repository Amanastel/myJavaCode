package com.masai.associationmapping.oneTOManyBi;

import javax.persistence.*;

//@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EmpID;
    private String EmpName;

    @ManyToOne
    private Department department;

    public Employee(int empID, String empName, Department department) {
        EmpID = empID;
        EmpName = empName;
        this.department = department;
    }

    public Employee() {
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


}
