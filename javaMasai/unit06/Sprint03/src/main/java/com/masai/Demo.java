package com.masai;

import com.we.PresentationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Travel obj = ctx.getBean("tr", Travel.class);
//        obj.journey();

//        A obj = ctx.getBean("aid", A.class);
//        obj.showA();


//        PresentationBean obj = ctx.getBean("pb", PresentationBean.class);
//        obj.present();
    }
}
