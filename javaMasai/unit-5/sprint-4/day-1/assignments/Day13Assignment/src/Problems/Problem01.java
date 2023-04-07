package Problems;

/*

    ## Problem 1:

    Consider the following table :

            ```sql
    For the table customer
    customerId : String
    name : String
    gender : String
    wallet_balanace : double
    date_of_joining: date
```

    Write a Jdbc application to

- insert 5 different customers by taking input from the User.
            - update the wallet_balanace & date of joining of a customer by taking the input from the user. to identify a customer uniquely use customerId.
- delete all the customer whose wallet_balanace is 0.00.
            - show list of customers
- search customer by range of date_of_joining (i.e. who joined from 2023-01-01 to 2023-03-31)

 */

import java.sql.*;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Problem01 {
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
    static void addCustomer(Scanner sc){
        Connection conn = null;
        try {
            conn = getConnectionToDatabase();
            String query = "INSERT INTO customer (customerId, name, gender, wallet_balanace, date_of_joining) value (?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(query);
//            System.out.println(ps);
            System.out.print("enter customerId id ");
            String customerId = sc.next();

            System.out.print("enter customer name ");
            String name = sc.next();

            System.out.print("enter gender ");
            String gender = sc.next();

            System.out.print("enter wallet Balance ");
            double wallet_balanace = sc.nextDouble();

            System.out.print("enter joining date ");
            LocalDate joiningDate = LocalDate.parse(sc.next());

            ps.setString(1, customerId);
            ps.setString(2, name);
            ps.setString(3,gender);
            ps.setDouble(4,wallet_balanace);
            ps.setDate(5, Date.valueOf(joiningDate));

            if(ps.executeUpdate()>0){
                System.out.println("customer added successfully ");
            }else {
                System.out.println("Unable to add customer " );
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


    static void deleteCustomer(Scanner sc){
        Connection conn = null;
        try {
            conn = getConnectionToDatabase();
            String query = "DELETE FROM customer WHERE wallet_balanace = ?";

            PreparedStatement ps = conn.prepareStatement(query);
//            System.out.println(ps);
            System.out.print("enter wallet_balanace ");
            String eid = sc.next();

            ps.setString(1, eid);
            if(ps.executeUpdate()>0){
                System.out.println("Customer Deleted successfully ");
            }else {
                System.out.println("Unable to Delete Customer " );
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
    static void updateCustomer(Scanner sc){
        Connection conn = null;
        try {
            conn = getConnectionToDatabase();
            String query = "UPDATE customer SET wallet_balanace = ?, date_of_joining = ? WHERE customerId = ?";

            PreparedStatement ps = conn.prepareStatement(query);
//            System.out.println(ps);
            System.out.print("enter Customer id ");
            String customerId = sc.next();

            System.out.print("enter wallet balance ");
            double balance = sc.nextDouble();
            System.out.print("enter joining date ");
            LocalDate joiningDate = LocalDate.parse(sc.next());

            ps.setDouble(1, balance);
            ps.setDate(2, Date.valueOf(joiningDate));
            ps.setString(3, customerId);
            if(ps.executeUpdate()>0){
                System.out.println("Customer update successfully ");
            }else {
                System.out.println("Unable to update Customer " );
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

    static void viewEmployee(){
        Connection conn = null;
        try {
            conn = getConnectionToDatabase();
            String query = "select * from customer;";

            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            if(!rs.isBeforeFirst() && rs.getRow() == 0){
                System.out.println("No Customer found");
            }else {
                while (rs.next()){
                    System.out.print(" Customer ID : "+ rs.getString(1));
                    System.out.print(" Customer Name : "+ rs.getString(2));
                    System.out.print(" Customer gender : "+ rs.getString(3));
                    System.out.print(" Customer wallet balance : "+ rs.getDouble(4));
                    System.out.print(" Customer Date : "+ rs.getDate(5));
                    System.out.println();
                }
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


    static void searchCustomerByJoiningDateRange(Scanner sc){
        Connection conn = null;
        try {
            conn = getConnectionToDatabase();
            String query = "SELECT * FROM customer WHERE date_of_joining BETWEEN ? AND ?";


            PreparedStatement ps = conn.prepareStatement(query);

            System.out.println("Please enter start date");
            Date startDate = Date.valueOf(LocalDate.parse(sc.next()));

            System.out.println("Please enter end date");
            Date endDate = Date.valueOf(LocalDate.parse(sc.next()));


            ps.setDate(1 , startDate);
            ps.setDate(2 , endDate);
            ResultSet rs = ps.executeQuery();
            if(!rs.isBeforeFirst() && rs.getRow() == 0){
                System.out.println("No Customer found");
            }else {
                while (rs.next()){
                    System.out.print(" Customer ID : "+ rs.getString(1));
                    System.out.print(" Customer Name : "+ rs.getString(2));
                    System.out.print(" Customer gender : "+ rs.getString(3));
                    System.out.print(" Customer wallet balance : "+ rs.getDouble(4));
                    System.out.print(" Customer Date : "+ rs.getDate(5));
                    System.out.println();
                }
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
//        addCustomer(sc);
        do {
            System.out.println("1. Add customer ");
            System.out.println("2. View customer ");
            System.out.println("3. update the wallet balance & date ");
            System.out.println("4. Delete customer ");
            System.out.println("5. Search customer By Joining Date Range ");
            System.out.println("0. Exit");
            System.out.print("Enter selection ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    addCustomer(sc);
                    break;
                case 2:
                    viewEmployee();
                    break;
                case 3:
                    updateCustomer(sc);
                    break;
                case 4:
                    deleteCustomer(sc);
                    break;
                case 5:
                    searchCustomerByJoiningDateRange(sc);
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
