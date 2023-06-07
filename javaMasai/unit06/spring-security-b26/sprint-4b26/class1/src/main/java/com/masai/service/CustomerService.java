package com.masai.service;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;

import java.util.List;

public interface CustomerService {
	
	public Customer registerCustomer(Customer customer);
	
	public Customer getCustomerDetailsByEmail(String email)throws CustomerException;
	
	public List<Customer> getAllCustomerDetails()throws CustomerException;


}
