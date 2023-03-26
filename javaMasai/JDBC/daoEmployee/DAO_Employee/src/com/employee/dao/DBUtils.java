package com.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {
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

    static boolean isResultSetEmpty(ResultSet rs) throws SQLException {
        if(!rs.isBeforeFirst() && rs.getRow() ==0)
            return true;
        return false;
    }
}
