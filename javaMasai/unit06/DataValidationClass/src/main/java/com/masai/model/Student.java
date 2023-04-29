package com.masai.model;

import jakarta.validation.constraints.*;

public class Student {

//    @Min(value = 100, message = "Roll number should be 100")
    @Min(value = 100,message = "{roll.invalid}")  // messages.properties change the message in location like hindi
    private Integer roll;

    @NotNull(message = "Name is mandatory")
//    @Size(min = 3, max = 10, message = "Name should be 3 to 10")
    @Size(min = 3,max = 10 ,message = "{name.invalid}")  // messages.properties change the message in location like hindi
    private String name;

    @NotNull(message = "Address is mandatory")
    @NotEmpty(message = "Address should be Not Empty")
    @NotBlank(message = "Address should be Not Null")
    private String address;
    private Integer marks;

    public Student(Integer roll, String name, String address, Integer marks) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public Student() {
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                '}';
    }
}
