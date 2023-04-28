package com.Challenge.controller;

import com.Challenge.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {
    private Map<Integer, Employee> employeeMap = new HashMap<>();


    @PostConstruct
    public void init(){
        employeeMap.put(10,new Employee(1,"Aman","Kumar","aman@gmail.com","backend-dev"));
        employeeMap.put(11,new Employee(2,"Rahul","Kumar","rahul@gmail.com","frontend-dev"));
        employeeMap.put(12,new Employee(3,"Priti","Tiwari","priti@gmail.com","node-dev"));
        employeeMap.put(13,new Employee(4,"rubel","khan","rubel@gmail.com","node-dev"));
        employeeMap.put(14,new Employee(5,"kunal","Kumar","kunal@gmail.com","react-dev"));
    }


    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployeeHandler(){

        Collection<Employee> collection = employeeMap.values();

        List<Employee> employeesList = new ArrayList<>(collection);

        ResponseEntity<List<Employee>> responseEntity = new ResponseEntity<>(employeesList, HttpStatus.FOUND);

        return responseEntity;
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable Integer id){

        if(employeeMap.containsKey(id)){
            Employee existingEmployee = employeeMap.get(id);

            ResponseEntity<Employee> responseEntity = new ResponseEntity<>(existingEmployee,HttpStatus.FOUND);

            return  responseEntity;
        }else {
            throw new IllegalArgumentException("Employee does not exist with Roll :"+id);
        }
    }

    @PostMapping("/employees")
    public ResponseEntity<String> addEmployeeHandler(@RequestBody Employee employee){

        employeeMap.put(employee.getId(),employee);
        return new ResponseEntity<>("Employee added Successfully "+employee, HttpStatus.CREATED);

    }



}
