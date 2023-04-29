package com.masai.controller;

import com.masai.model.Student;
import com.masai.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/students")
    public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student){

       Student registerStudent = studentService.saveStudent(student);
       return new ResponseEntity<>(registerStudent, HttpStatus.CREATED);
    }


    @GetMapping("/students/{roll}")
    public ResponseEntity<Student> getStudentByRollHandler(@PathVariable Integer roll){

        Student student = studentService.getStudentByRoll(roll);

        return new ResponseEntity<>(student, HttpStatus.FOUND);
    }


    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudentHandler(){

        List<Student> allStudent = studentService.getAllStudent();

        return new ResponseEntity<>(allStudent,HttpStatus.FOUND);

    }
}
