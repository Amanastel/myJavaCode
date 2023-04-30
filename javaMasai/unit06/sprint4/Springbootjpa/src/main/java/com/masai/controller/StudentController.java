package com.masai.controller;

import com.masai.model.Student;
import com.masai.model.StudentDto;
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

    @DeleteMapping("/students/{roll}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable Integer roll){

        Student deletedStudent = studentService.deleteByStudentRoll(roll);
        return new ResponseEntity<>(deletedStudent, HttpStatus.OK);
    }

    @PutMapping("students/{roll}")
    public ResponseEntity<Student> updateStudentByRollHandler(@PathVariable Integer roll, @RequestBody StudentDto student){

        Student updateStudent = studentService.updateStudent(roll,student);
        return new ResponseEntity<>(updateStudent,HttpStatus.ACCEPTED);
    }


    @PatchMapping("students/{roll}")
    public ResponseEntity<Student> updateStudentMarksHandler(@PathVariable Integer roll, @RequestParam(value =
            "gmarks", required = false , defaultValue = "20") Integer gmarks){

        Student updateStudent = studentService.updateStudentMarks(roll, gmarks);

        return new ResponseEntity<>(updateStudent,HttpStatus.ACCEPTED);

    }


    //http://localhost:8080/getStudents?address=delhi
    @GetMapping("/getStudents")
    public ResponseEntity<List<Student>> getStudentByAddress(@RequestParam("address") String address){

        List<Student> students = studentService.getStudentByAddress(address);
        return new ResponseEntity<>(students,HttpStatus.OK);
    }
}
