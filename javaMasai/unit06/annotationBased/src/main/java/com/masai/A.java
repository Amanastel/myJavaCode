package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service(value = "a1")
public class A {

  /*  @Autowired
    private List<String> list;

//    @Autowired same like setB1

    @Autowired(required = false)
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
*/

    @Value("${roll}")
    int roll;

    @Value("${name}")
    String name;

    @Value("${marks}")
    int marks;


    @Value("${db.driverName}")
    private String dname;

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String uname;

    @Value("${db.password}")
    private String pass;


    public void funA() {
        System.out.println("inside funA of A");
        System.out.println("Roll is "+roll);
        System.out.println("Name is "+name);
        System.out.println("Marks is "+marks);
        System.out.println("Driver name  is "+dname);
        System.out.println("Connection URL  is "+url);
        System.out.println("Username  is "+uname);
        System.out.println("Password  is "+pass);
    }



}