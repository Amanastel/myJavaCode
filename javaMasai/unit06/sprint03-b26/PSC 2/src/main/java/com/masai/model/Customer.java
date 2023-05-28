package com.masai.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	
	@NotNull(message = "Name can not be null")
    private String name;
	@Email(message = "Email sould be in a proper format")
    private String email;
	@NotNull(message= "address is mandatory")
    private String address;
	
	@OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Orders> orders ;

	
	
	


}
