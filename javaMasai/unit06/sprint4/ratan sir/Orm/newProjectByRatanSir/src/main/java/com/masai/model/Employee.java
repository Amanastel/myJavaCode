package com.masai.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String ename;
    private String email;
    private String salary;

    @Enumerated(EnumType.STRING)
    private Gander gander;

    @Embedded
    private Address address;

    @JsonIgnore
    @ManyToOne
    private Department dept;
}
