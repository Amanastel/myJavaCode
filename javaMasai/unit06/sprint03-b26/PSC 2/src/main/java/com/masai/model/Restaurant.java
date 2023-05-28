package com.masai.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer restaurantId;

	@NotNull(message="value can not be null")
    private String name;

	@NotNull(message="value can not be null")
    private String address;

	
	@OneToMany(mappedBy = "restaurant" , cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Orders> orders ;
	
	@ManyToMany
	private List<DeliveryPartner> delivaryList = new ArrayList<>();

}