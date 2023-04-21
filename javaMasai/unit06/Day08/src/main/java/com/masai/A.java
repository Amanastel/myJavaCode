package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A {
    private String driverName;
    private String url;
    private String username;
    private String password;
    private Connection conn;
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void init(){

        System.out.println("inside init method of class A where connection will be established");

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            conn = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertStudentRecord() throws SQLException {
        conn.prepareStatement("show tables");
        System.out.println("connection obj is ready to insert a record into the table "+ conn);
    }

    public void tearDown(){
        try {
            System.out.println("System are close");
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
