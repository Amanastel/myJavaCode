package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service(value = "a1")
public class A {

//    @Autowired same like setB1
    private B b1;

    @Autowired
    public void setB1(B b1) {
        this.b1 = b1;
    }

    @PostConstruct
    public void setUp() {
        System.out.println("inside set up method");
    }

    @PreDestroy
    public void tearDown(){
        System.out.println("inside tear down method");
    }


    public void funA() {
        System.out.println("inside funA of A");
        System.out.println("B class object :"+ b1);
    }



}