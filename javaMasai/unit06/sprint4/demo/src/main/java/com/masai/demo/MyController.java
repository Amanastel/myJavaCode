package com.masai.demo;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
@RestController // = @Controller + @ResponseBody
@RequestMapping("/student")
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
    @RequestMapping("/getStudent")
//    @ResponseBody
    public Student getStudentHandler(){
        Student student = new Student(19,"Aman","Kanpur",98);
        return student;
    }



    @RequestMapping("/getStudents")
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


    @RequestMapping(value = "/getMapStudents")
    public Map<Student, String> getStudentHandlerMap(){

        Map<Student, String> map = new HashMap<>();
        map.put(new Student(1,"Aman","Kanpur",98),"delhi");
        map.put(new Student(2,"Rubel","West Bengal",98),"kolkata");
        map.put(new Student(3,"Himanshu","Kanpur",98),"panjab");
        map.put(new Student(4,"rahul","delhi",98),"noida");
        map.put(new Student(5,"anshika","Kanpur",98),"delhi");
        return map;
    }


//    @RequestMapping(value = "/StudentObj")
//    @RequestMapping(value = "/StudentObj", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    @GetMapping(value = "/StudentObj", produces = MediaType.APPLICATION_XML_VALUE)
    @GetMapping(value = "/getStudentObj", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student getStudentHandler1(){
        return new Student(1,"Aman","Kanpur",98);
    }



    //http://localhost:8080/student/getStudentObjPath/10/aman/kanpur/780
    @GetMapping(value = "/getStudentObjPath/{roll}/{n}/{add}/{m}")
    public Student getStudentHandler2(@PathVariable Integer roll,
                                      @PathVariable("n") String name,
                                      @PathVariable("add") String Address,
                                      @PathVariable("m") Integer marks){
        return new Student(roll,name, Address ,marks);
    }

    @PostMapping(value = "/studentsAll")
    public String saveStudent(@RequestBody Student student){
        return "Student same, "+ student;
    }

}
