package com.we03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {


        //activate the spring container by locating the spring configuration file..

        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");




        A a1 =  ctx.getBean("aid",A.class);

        a1.show();



    }
}
