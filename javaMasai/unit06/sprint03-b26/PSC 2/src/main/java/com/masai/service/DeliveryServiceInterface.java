package com.masai.service;

import com.masai.exception.SwiggyException;
import com.masai.model.Customer;

public interface DeliveryServiceInterface {
	
	public void saveCustomer(Customer c ) throws SwiggyException ;

}
