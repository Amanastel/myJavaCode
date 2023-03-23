package com.employee.dto;

import java.time.LocalDate;

public class Employee {
    private String empId;
    private String name;
    private double salary;
    private LocalDate date;

    public Employee(String empId, String name, double salary, LocalDate date) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
