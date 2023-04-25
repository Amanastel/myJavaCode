package com.masai.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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



    @RequestMapping("/students")
    @ResponseBody
    public List<Student> getStudentsHandler(){

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Aman","Kanpur",98));
        students.add(new Student(2,"Rubel","West Bengal",98));
        students.add(new Student(3,"priti","Kanpur",98));
        students.add(new Student(4,"Avishek","Kolkata",98));
        students.add(new Student(5,"Rahul","Delhi",98));

        return students;
    }
}
