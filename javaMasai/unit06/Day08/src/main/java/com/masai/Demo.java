package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        A obj = ctx.getBean("a1", A.class);

        obj.insertStudentRecord();
    }
}
