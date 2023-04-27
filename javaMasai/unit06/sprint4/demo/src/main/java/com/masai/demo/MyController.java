package com.masai.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
@RestController // = @Controller + @ResponseBody
public class MyController {

    @RequestMapping("/hello")
//    @ResponseBody
    public String sayHello(){
        return "Welcome to Spring Boot Rest API";
    }

    @RequestMapping("/htmls")
//    @ResponseBody
    public String htmlSpring(){
        return "welcome.html";
    }
    @RequestMapping("/student")
//    @ResponseBody
    public Student getStudentHandler(){
        Student student = new Student(19,"Aman","Kanpur",98);
        return student;
    }



    @RequestMapping("/students")
//    @ResponseBody
    public List<Student> getStudentsHandler(){

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Aman","Kanpur",98));
        students.add(new Student(2,"Rubel","West Bengal",98));
        students.add(new Student(3,"Himanshu","Kanpur",98));
        students.add(new Student(4,"Avishek","Kolkata",98));
        students.add(new Student(5,"Rahul","Delhi",98));

        return students;
    }


    @RequestMapping(value = "/mapStudents")
    public Map<Student, String> getStudentHandlerMap(){

        Map<Student, String> map = new HashMap<>();
        map.put(new Student(1,"Aman","Kanpur",98),"delhi");
        map.put(new Student(2,"Rubel","West Bengal",98),"kolkata");
        map.put(new Student(3,"Himanshu","Kanpur",98),"panjab");
        map.put(new Student(4,"rahul","delhi",98),"noida");
        map.put(new Student(5,"anshika","Kanpur",98),"delhi");
        return map;
    }
}
