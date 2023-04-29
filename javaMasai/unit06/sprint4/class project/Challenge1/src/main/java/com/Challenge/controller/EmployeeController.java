package com.Challenge.controller;

import com.Challenge.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {
    private Map<Integer, Employee> employeeMap = new HashMap<>();


    @PostConstruct
    public void init(){
        employeeMap.put(1,new Employee(1,"Aman","Kumar","aman@gmail.com","backend-dev"));
        employeeMap.put(2,new Employee(2,"Rahul","Kumar","rahul@gmail.com","frontend-dev"));
        employeeMap.put(3,new Employee(3,"Priti","Tiwari","priti@gmail.com","node-dev"));
        employeeMap.put(4,new Employee(4,"rubel","khan","rubel@gmail.com","node-dev"));
        employeeMap.put(5,new Employee(5,"kunal","Kumar","kunal@gmail.com","react-dev"));
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


    @PutMapping("/employees/{id}")
    public  ResponseEntity<String> updateEmployeeHandler(@PathVariable Integer id , @RequestBody Employee employee){


        if(employeeMap.containsKey(id)){
            Employee existingEmployee = employeeMap.get(id);

            existingEmployee.setFirstName(employee.getFirstName());
            existingEmployee.setLastName(employee.getLastName());
            existingEmployee.setPosition(employee.getPosition());
            existingEmployee.setEmail(employee.getEmail());

            employeeMap.put(id,existingEmployee);

            return new ResponseEntity<>("Employee updated Successfully ", HttpStatus.UPGRADE_REQUIRED);
        }else {
            throw new IllegalArgumentException("Employee does not exist with ID :"+id);
        }
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeHandler(@PathVariable Integer id){
        if(employeeMap.containsKey(id)){
            employeeMap.remove(id);
            return "Employee delete Successfully";
        }else {
            throw new IllegalArgumentException("Employee does not exist with ID :"+id);
        }
    }
}
