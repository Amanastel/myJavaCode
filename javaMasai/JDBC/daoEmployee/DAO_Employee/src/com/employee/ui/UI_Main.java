package com.employee.ui;

import com.employee.dao.EmployeeDAO;
import com.employee.dto.Employee;

import java.time.LocalDate;
import java.util.Scanner;

public class UI_Main {
    static void addEmployeeUI(Scanner sc){

        System.out.print("enter employee id ");
        String eid = sc.next();

        System.out.print("enter employee name ");
        String name = sc.next();

        System.out.print("enter salary ");
        double salary = sc.nextDouble();

        System.out.print("enter joining date ");
        LocalDate joiningDate = LocalDate.parse(sc.next());

        Employee employee = new Employee(eid, name, salary,joiningDate);

        EmployeeDAO empDao = new EmployeeDAO();
        empDao.AddEmployee(employee);
    }

    static void updateEmployeeUI(Scanner sc){

        System.out.print("enter employee id ");
        String eid = sc.next();

        System.out.print("enter employee name ");
        String name = sc.next();

        System.out.print("enter salary ");
        double salary = sc.nextDouble();

        System.out.print("enter joining date ");
        LocalDate joiningDate = LocalDate.parse(sc.next());
    }

    static void deleteEmployeeUI(Scanner sc){

        System.out.print("enter employee id ");
        String eid = sc.next();

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Add Employee ");
            System.out.println("2. View Employee ");
            System.out.println("3. Update Employee ");
            System.out.println("4. Delete Employee ");
            System.out.println("5. Search Employee By Joining Date Range ");
            System.out.println("0. Exit");
            System.out.print("Enter selection ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    addEmployeeUI(sc);
                    break;
                case 2:
//                    viewEmployee();
                    break;
                case 3:
                    updateEmployeeUI(sc);
                    break;
                case 4:
                    deleteEmployeeUI(sc);
                    break;
                case 5:
//                    searchEmployeeByJoiningDateRange(sc);
                    // Search Employee By Joining Date Range method
                    break;
                case 0:
                    System.out.println("Thanks for using our services");
                    break;
                default:
                    System.out.println("Invalid Selection, try again later");
            }

        }while (choice !=0);
        sc.close();
    }
}
