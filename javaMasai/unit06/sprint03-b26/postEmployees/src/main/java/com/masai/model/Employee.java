package com.masai.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	private String ename;
	private String email;
	private Integer salary;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dob;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Embedded
	private Address address;
	
	@JsonIgnore
	@ManyToOne
	private Department dept;
	
	
	
	
	
	
	
	

}
