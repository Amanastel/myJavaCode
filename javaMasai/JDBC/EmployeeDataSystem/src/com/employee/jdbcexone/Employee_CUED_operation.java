package com.employee.jdbcexone;


import java.sql.*;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Employee_CUED_operation {
    static Connection getConnectionToDatabase() throws SQLException, ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        ResourceBundle resourceBundle =  ResourceBundle.getBundle("db");

//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Problem01", "root", "aman1234");
        return DriverManager.getConnection(resourceBundle.getString("url"),resourceBundle.getString("user"),resourceBundle.getString("password"));

    }
    /**
     * close the connection with the database
     * @param conn Connection object for which connection is to be closed
     * @throws SQLException if anything goes wrong
     */
    static void closeConnection(Connection conn) throws SQLException{
        if(conn != null){
            conn.close();
        }
    }

    static void addEmployee(Scanner sc){
        Connection conn = null;
        try {
            conn = getConnectionToDatabase();
            String query = "INSERT INTO employee (eid, name, salary, joining_date) value (?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(query);
//            System.out.println(ps);
            System.out.print("enter employee id ");
            String eid = sc.next();
            System.out.print("enter employee name ");
            String name = sc.next();
            System.out.print("enter salary ");
            double salary = sc.nextDouble();
            System.out.print("enter joining date ");
            LocalDate joiningDate = LocalDate.parse(sc.next());

            ps.setString(1, eid);
            ps.setString(2, name);
            ps.setDouble(3,salary);
            ps.setDate(4, Date.valueOf(joiningDate));

            if(ps.executeUpdate()>0){
                System.out.println("Employee added successfully ");
            }else {
                System.out.println("Unable to add employee " );
            }

        }catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }finally {
            if(conn != null){
                try {
                    closeConnection(conn);
                }catch (SQLException ex){

                }
            }
        }

    }


    static void updateEmployee(Scanner sc){
        Connection conn = null;
        try {
            conn = getConnectionToDatabase();
            String query = "UPDATE employee SET name = ?, salary = ?, joining_date = ? WHERE eid = ?";

            PreparedStatement ps = conn.prepareStatement(query);
//            System.out.println(ps);
            System.out.print("enter employee id ");
            String eid = sc.next();
            System.out.print("enter employee name ");
            String name = sc.next();
            System.out.print("enter salary ");
            double salary = sc.nextDouble();
            System.out.print("enter joining date ");
            LocalDate joiningDate = LocalDate.parse(sc.next());

            ps.setString(1, name);
            ps.setDouble(2,salary);
            ps.setDate(3, Date.valueOf(joiningDate));
            ps.setString(4, eid);
            if(ps.executeUpdate()>0){
                System.out.println("Employee added successfully ");
            }else {
                System.out.println("Unable to add employee " );
            }

        }catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }finally {
            if(conn != null){
                try {
                    closeConnection(conn);
                }catch (SQLException ex){

                }
            }
        }

    }


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Scanner sc = new Scanner(System.in);
       int choice = 0;
       do {
           System.out.println("1. Add Employee ");
           System.out.println("2. View Employee ");
           System.out.println("2. Update Employee ");
           System.out.println("3. Delete Employee ");
           System.out.println("5. Search Employee By Joining Date Range ");
           System.out.print("Enter selection ");
           choice = sc.nextInt();

           switch(choice) {
               case 1:
                   addEmployee(sc);
                  // Add employee method
                   break;
               case 2:
                  // view Employee method
                   break;
               case 3:
                  // Update Employee method
                   break;
               case 4:
                   // Delete Employee method
                   break;
               case 5:
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









