package com.masai.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	@NotNull(message="value can not be null")
    private String customerId;
	@NotNull(message="value can not be null")
    private String restaurantId;
	@NotNull(message="value can not be null")
    private String deliveryPartnerId;
	@NotNull(message="value can not be null")
    private List<String> items;
	@NotNull(message="value can not be null")
    private OrderStatus orderStatus;
	
	@ManyToOne
	private Customer customer ;
	@ManyToOne
	private Restaurant restaurant ;
	@ManyToOne
	private DeliveryPartner deliveryPartner ;


}