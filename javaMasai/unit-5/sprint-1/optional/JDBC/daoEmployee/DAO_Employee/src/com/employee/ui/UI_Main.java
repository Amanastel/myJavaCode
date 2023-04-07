
package com.employee.ui;

import com.employee.dao.EmployeeDAO;
import com.employee.dao.EmployeeDAOImpl;
import com.employee.dto.Employee;
import com.employee.dto.EmployeeImpl;
import com.employee.exception.NoRecordFoundException;
import com.employee.exception.SomethingWentWrongException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

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

        Employee employee = new EmployeeImpl(eid, name, salary,joiningDate);

        EmployeeDAO empDao = new EmployeeDAOImpl();

        try {
            empDao.addEmployee(employee);
            System.out.println("Employee added successfully");
        }catch (SomethingWentWrongException ex){
            System.out.println(ex);
        }
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

        Employee employee = new EmployeeImpl(eid, name, salary,joiningDate);


        EmployeeDAO empDAO = new EmployeeDAOImpl();
        try {
            empDAO.updateEmployee(employee);
            System.out.println("Employee updated successfully");
        }catch (SomethingWentWrongException ex){
            System.out.println(ex);
        }
    }

    static void deleteEmployeeUI(Scanner sc){

        System.out.print("Enter employee id ");
        String eid = sc.next();

        EmployeeDAO empDAO = new EmployeeDAOImpl();

        try {
            //call the update employee method
            empDAO.deleteEmployee(eid);
            //print success message
            System.out.println("Employee deleted successfully");
        }catch(SomethingWentWrongException ex) {
            //print error message if error if there
            System.out.println(ex);
        }
    }
    static void viewEmployee(){
        EmployeeDAO empDAO = new EmployeeDAOImpl();
        try {
            List<Employee> empList = empDAO.getEmployeeList();
            Consumer<Employee> con = emp -> System.out.println("Employee Id " + emp.getEmpId() + " Name " + emp.getName()
                    + " Salary " + emp.getSalary() + " Joining Date " + emp.getJoiningDate());
            empList.forEach(con);
        }catch(SomethingWentWrongException | NoRecordFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void searchEmployeeByJoiningDateRange(Scanner sc) {
        System.out.print("Enter start date ");
        LocalDate startDate = LocalDate.parse(sc.next());
        System.out.print("Enter end date ");
        LocalDate endDate = LocalDate.parse(sc.next());
        //take an object of DAO
        EmployeeDAO empDAO = new EmployeeDAOImpl();
        try {
            List<Employee> empList = empDAO.searchEmployeeByJoiningDateRange(startDate, endDate);
            Consumer<Employee> con = emp -> System.out.println("Employee Id " + emp.getEmpId() + " Name " + emp.getName()
                    + " Salary " + emp.getSalary() + " Joining Date " + emp.getJoiningDate());
            empList.forEach(con);
        }catch(SomethingWentWrongException | NoRecordFoundException ex) {
            System.out.println(ex.getMessage());
        }
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
                    viewEmployee();
                    break;
                case 3:
                    updateEmployeeUI(sc);
                    break;
                case 4:
                    deleteEmployeeUI(sc);
                    break;
                case 5:
                    searchEmployeeByJoiningDateRange(sc);
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

