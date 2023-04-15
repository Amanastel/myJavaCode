package com.masai.associationmapping.oneTOManyBi;

import javax.persistence.*;
import java.util.Set;

//@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptID;
    private String deptName;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private Set<Employee> employees;

    public Department(int deptID, String deptName, Set<Employee> employees) {
        this.deptID = deptID;
        this.deptName = deptName;
        this.employees = employees;
    }

    public Department() {
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

}
