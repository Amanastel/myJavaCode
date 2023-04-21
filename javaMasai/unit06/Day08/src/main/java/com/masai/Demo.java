package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Demo {

//    public Demo(){
//
//    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("this is a garbage collector");
//    }

    public static void main(String[] args) throws SQLException {

        /*Demo demo = new Demo();
        demo = null;  garbage collector finalize()
        System.gc();*/

        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");

        A obj = ctx.getBean("a1", A.class);
        A obj2 = ctx.getBean("a1", A.class);
        System.out.println(obj2 == obj);

        obj.insertStudentRecord();


        ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext) ctx;
        ctx2.close();

    }
}
