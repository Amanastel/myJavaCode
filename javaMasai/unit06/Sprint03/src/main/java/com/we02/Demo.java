package com.we02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Demo {

    public static void main(String[] args) {


        //activate the spring container by locating the spring configuration file..

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


       /* Collage collage = ctx.getBean("cl1", Collage.class);

        List<Student> students = collage.getStudents();

        System.out.println("Collage name is " + collage.getCollageName());

        System.out.println("-----------------------------");

        students.forEach(student -> {

            student.displayDetails();
            System.out.println("==================");
        });*/


        A obj = ctx.getBean("aid", A.class);
        obj.show();

        A2 obj2 = ctx.getBean("aid2", A2.class);
        obj2.show();


    }
}
