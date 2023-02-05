package com.masai;

import java.util.*;

//Problem Statement: 
//Create a class EPFOAccount that has private data members like accountNo and balance. Create parameterized constructor and override toString() method to return the textual presentation of the EPFOAccount object like
//
//Account number: EPF001 Balance: 25500/-
//
//Create a class Employee with private data members like employeeId, name, salary and epfoAccount (use has-A relationship). Override the equals(), hashcode() & toString() method such that
//
//1. If two employee objects have same employeeId then equals() method should return true for them and hashcode of these objects must be same
//
//2. The textual presentation of the Employee object be like
//
//Employee Id: E001 Name: Anuj Salary: 45000 EPFO Account details: (Account number: EPF001 Balance: 25500/-)

class EPFOAccount {
	  private String accountNo;
	  private double balance;

	  public EPFOAccount(String accountNo, double balance) {
	    this.accountNo = accountNo;
	    this.balance = balance;
	  }

	  public String toString() {
	    return "Account number: " + accountNo + " Balance: " + balance + "/-";
	  }
	}

	class Employee {
	  private String employeeId;
	  private String name;
	  private double salary;
	  private EPFOAccount epfoAccount;

	  public Employee(String employeeId, String name, double salary, EPFOAccount epfoAccount) {
	    this.employeeId = employeeId;
	    this.name = name;
	    this.salary = salary;
	    this.epfoAccount = epfoAccount;
	  }

	  public boolean equals(Object o) {
	    if (o == this) return true;
	    if (!(o instanceof Employee)) return false;
	    Employee e = (Employee) o;
	    return e.employeeId.equals(this.employeeId);
	  }

	  public int hashCode() {
	    return Objects.hash(employeeId);
	  }

	  public String toString() {
	    return "Employee Id: " + employeeId + " Name: " + name + " Salary: " + salary + " EPFO Account details: " + epfoAccount.toString();
	  }
	}


class Main{
  static public void main(String args[]){
    EPFOAccount e1 = new EPFOAccount("EPFO001", 25000);
    EPFOAccount e2 = new EPFOAccount("EPFO002", 35000);

    Employee emp1 = new Employee ("E001", "Anuj", 45000, e1);
    Employee emp2 = new Employee ("E002", "Jayesh", 38000, e2);
    Employee emp3 = new Employee ("E001", "Rajesh", 35500, e2);
    
    System.out.println(emp1.equals(emp2));
    System.out.println(emp2.equals(emp3));
    System.out.println(emp3.equals(emp1));
    System.out.println();

    System.out.println(emp1.hashCode() == emp2.hashCode());
    System.out.println(emp2.hashCode() == emp3.hashCode());
    System.out.println(emp3.hashCode() == emp1.hashCode());
    System.out.println();

    System.out.println(emp1);
    System.out.println(emp2);
    System.out.println(emp3);
  }
}

//Output
//false
//false
//true
//
//false
//false
//true
//
//Employee Id: E001 Name: Anuj Salary: 45000 EPFO Account details: (Account number: EPFO001 Balance: 25000/-)
//Employee Id: E002 Name: Jayesh Salary: 38000 EPFO Account details: (Account number: EPFO002 Balance: 35000/-)
//Employee Id: E001 Name: Rajesh Salary: 35500 EPFO Account details: (Account number: EPFO002 Balance: 35000/-)
