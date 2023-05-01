package com.masai.controller;

import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.service.CourseService;
import com.masai.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students/{cname}")
    public ResponseEntity<Student> registerStudentHandler(@PathVariable(value = "cname") String cname, @RequestBody Student student) throws CourseException {

       Student savedStudent = studentService.registerStudentInCourse(cname, student);

       return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @GetMapping("/students/{cname}")
    public ResponseEntity<List<Student>> getStudentByCourseName(@PathVariable(value = "cname") String cname) throws CourseException {

        List<Student> students = studentService.findStudentByCourseName(cname);
        return new ResponseEntity<List<Student>>(students, HttpStatus.FOUND);
    }
}
