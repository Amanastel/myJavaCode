package com.masai.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "Welcome to Spring Boot Rest API";
    }

    @RequestMapping("/student")
    @ResponseBody
    public Student getStudentHandler(){
        Student student = new Student(19,"Aman","Kanpur",98);
        return student;
    }


}
