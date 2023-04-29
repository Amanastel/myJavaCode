package com.masai.controller;


import com.masai.exception.InvalidNumberException;
import com.masai.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {
    private Map<Integer, Student> map = new HashMap<>();

    @PostConstruct
    public void init() {
        map.put(10, new Student(10, "Ram", "Delhi", 800));
        map.put(11, new Student(11, "Sunil", "Delhi", 820));
        map.put(12, new Student(12, "Ramesh", "Chennai", 840));
        map.put(13, new Student(13, "Manoj", "Kolkata", 700));
        map.put(14, new Student(14, "Suresh", "Pune", 600));
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudentsHandler(){

        Collection<Student> collection= map.values();


//		List<Student> students = new ArrayList<>();
//
//		for(Student student:collection) {
//
//			students.add(student);
//		}
//

        List<Student> students = new ArrayList<>(collection);

        ResponseEntity<List<Student>> re = new ResponseEntity<>(students, HttpStatus.FOUND);


        return re;
    }

   /* @PostMapping("/students")
    public String addStudentHandler(@RequestBody Student student){
        map.put(student.getRoll(), student);
        return "Student stored successfully "+ student;
    }
*/
   @PostMapping("/students")
    public ResponseEntity<String> addStudentHandler(@RequestBody Student student) {

        map.put(student.getRoll(), student);
        String result = "Student stored Successfully "+student;

        return new ResponseEntity<>(result ,HttpStatus.CREATED);

    }


    @GetMapping("/students/{roll}")
    public ResponseEntity<Student> getStudentByRollHandler(@PathVariable Integer roll) {

        if(map.containsKey(roll)) {

            Student existingStudent= map.get(roll);

            HttpHeaders headers = new HttpHeaders();
            headers.add("jwttoken","an134kpema");
            headers.add("pincode","1244448798");

            ResponseEntity<Student> re = new ResponseEntity<>(existingStudent,headers ,HttpStatus.FOUND);



            ResponseEntity.ok().build();
//            return ResponseEntity.ok().build();
            return re;
        }else
            throw new IllegalArgumentException("Student does not exist with Roll :"+roll);
    }


    @PutMapping("/students/{roll}")
    public String updateStudentHandler(@PathVariable Integer roll,@RequestBody Student student) {

        if(map.containsKey(roll)) {

            Student existingStudent = map.get(roll);
            existingStudent.setName(student.getName());
            existingStudent.setAddress(student.getAddress());
            existingStudent.setMarks(student.getMarks());

            map.put(roll, existingStudent);

            return "Student updated successfully.";

        }else
            throw new IllegalArgumentException("Student does not exist with roll :"+roll);

    }


    //http://localhost:8080/students/10?gmarks=50

    @PatchMapping("/students/{roll}")
    public String updateStudentMarksHandler(@PathVariable Integer roll, @RequestParam Integer gmarks) {


        if(map.containsKey(roll)) {

            Student existingStudent= map.get(roll);

            existingStudent.setMarks(existingStudent.getMarks()+gmarks);

            map.put(roll, existingStudent);

            return "Student marks is graced by "+gmarks;


        }else
            throw new IllegalArgumentException("Student does not exist with roll :"+roll);



    }

	@DeleteMapping("/students/{roll}")
	public String deleteStudentByRollHandler(@PathVariable Integer roll) {
        if(map.containsKey(roll)) {
            map.remove(roll);
            return "Student delete successfully: " + roll;
        }else {
            throw new IllegalArgumentException("Student does not exist with roll :"+roll);
        }
	}


    @GetMapping("/hello/{num}")
    public String sayHello(@PathVariable Integer num){
       if(num>100)
           throw new InvalidNumberException("Number should be less then 100");

       int x = 1000/num;
       return "welcome to spring boot "+num;

    }


}
