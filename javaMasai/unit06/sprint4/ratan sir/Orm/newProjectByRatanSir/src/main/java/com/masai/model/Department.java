package com.masai.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deptId;
    private String dName;
    private String location;

    @OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();
}
