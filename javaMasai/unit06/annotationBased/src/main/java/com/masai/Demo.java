package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {


//        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext ctx= new AnnotationConfigApplicationContext(mySpringConfig.class);
        A obj =  ctx.getBean("a1",A.class);

        obj.funA();

    }
}