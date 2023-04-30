package com.masai.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class StudentDto {
    @NotNull(message = "Name is mandatory")
//    @Size(min = 3, max = 10, message = "Name should be 3 to 10")
    @Size(min = 3,max = 10 ,message = "{name.invalid}")  // messages.properties change the message in location like hindi
    private String name;

    @NotNull(message = "Address is mandatory")
    @NotEmpty(message = "Address should be Not Empty")
    @NotBlank(message = "Address should be Not Null")
    private String address;
    private Integer marks;

//    public StudentDto(String name, String address, Integer marks) {
//        this.name = name;
//        this.address = address;
//        this.marks = marks;
//    }
//
//    public StudentDto() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Integer getMarks() {
//        return marks;
//    }
//
//    public void setMarks(Integer marks) {
//        this.marks = marks;
//    }
//
//    @Override
//    public String toString() {
//        return "StudentDto{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", marks=" + marks +
//                '}';
//    }
}

