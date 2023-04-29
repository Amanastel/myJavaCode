package com.masai.controller;


import com.masai.model.Student;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @PostMapping("/students")
    public ResponseEntity<String > saveStudentHandler(@Valid @RequestBody Student student){


        String result = "Student save successfully... "+student;
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
