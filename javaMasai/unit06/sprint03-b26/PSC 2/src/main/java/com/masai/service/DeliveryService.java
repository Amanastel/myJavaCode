package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.masai.exception.SwiggyException;
import com.masai.model.Customer;
import com.masai.model.DeliveryPartner;
import com.masai.model.OrderStatus;
import com.masai.model.Orders;
import com.masai.model.Restaurant;
import com.masai.model.repository.DeliveryPartnerRepository;
import com.masai.model.repository.OrdersRepository;
import com.masai.model.repository.RestaurantRepository;
import com.masai.model.repository.customerRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
@Service
@Slf4j
public class DeliveryService  {
	
	
	@Autowired
	private customerRepository cRepo ;
	
	@Autowired
	private RestaurantRepository rRepo;
	
	@Autowired
	private DeliveryPartnerRepository dRepo;
	
	@Autowired
	private OrdersRepository oRepo;


    
    public void addCustomer(Customer customer) {
    	log.info("customer added successfully");
    	if(customer == null) throw new SwiggyException("Customer is null") ; 
    	Optional<Customer> cus = cRepo.findById(customer.getCustomerId()) ;
    	if(cus.isPresent()) throw new SwiggyException("already present in database") ;
    		cRepo.save(customer) ;
       
    }

    public void addRestaurant(Restaurant restaurant) {
    	log.info("Resturant added successfully");
  	
  	if(restaurant == null) throw new SwiggyException("restaurant is null") ; 
  	Optional<Restaurant> cus = rRepo.findById(restaurant.getRestaurantId()) ;
  	if(cus.isPresent() ) throw new SwiggyException("already present in database") ;
  		rRepo.save(restaurant) ;
    }

    public void addDeliveryPartner(DeliveryPartner deliveryPartner) {
    	log.info("Delivary partner added successfully");
  	Optional<DeliveryPartner> cus = dRepo.findById(deliveryPartner.getDeliveryPartnerId()) ;
  	if(cus.isPresent()) throw new SwiggyException("already present in database") ;
  		dRepo.save(deliveryPartner) ;
    	
    }

    public void placeOrder(Integer customerId , Integer resId , Integer devId ,  Orders order) {
    	Optional<Customer> cus = cRepo.findById(customerId) ;
    	Optional<Restaurant> res = rRepo.findById(resId) ;
    	Optional<DeliveryPartner> dpart = dRepo.findById(devId) ;
    	if(cus.isEmpty() || res.isEmpty()|| dpart.isEmpty() || order == null) throw new SwiggyException("Null value") ;
    	order.setCustomer(cus.get());
    	order.setDeliveryPartner(dpart.get());
    	order.setRestaurant(res.get());
    	res.get().getOrders().add(order) ;
    	cus.get().getOrders().add(order) ;
    	dpart.get().getOrders().add(order) ;
    	oRepo.save(order) ;
    	
        
    }

    public void assignDeliveryPartner(Integer orderId, Integer deliveryPartnerId) {
    	
    	log.info("Finding the dpart and order");
    	Optional<DeliveryPartner> dpart = dRepo.findById(deliveryPartnerId) ;
    	Optional<Orders> order = oRepo.findById(orderId) ;
    	if(dpart.isEmpty() || order.isEmpty()) throw new SwiggyException("null value") ;
    	dpart.get().getOrders().add(order.get()) ;
    	order.get().setDeliveryPartner(dpart.get());
    	oRepo.save(order.get()) ;
    }

    public void updateOrderStatus(Integer orderId, OrderStatus newStatus) {
    	Optional<Orders> order = oRepo.findById(orderId) ;
        if (order.get().getOrderStatus() == OrderStatus.DELIVERED) {
            throw new SwiggyException("Cannot change the status of a delivered order") ;
        }
        order.get().setOrderStatus(newStatus);
        oRepo.save(order.get()) ;
        }

       

    public List<Orders> fetchCustomerOrderHistory(Integer customerId)  {
    	Optional<Customer> cus = cRepo.findById(customerId ) ;
    	if(cus.isEmpty()) throw new SwiggyException("null vallue") ;
    	if( cus.get().getOrders().isEmpty()) throw new SwiggyException("Empty order list") ;
    	return cus.get().getOrders() ;
    }

	public List<Customer> getAllCustomers() {
	org.springframework.data.domain.Pageable pageable = PageRequest.of(0, 5, Sort.by("name").ascending()) ;
	List<Customer> customersList = cRepo.findAll(pageable).getContent() ;
	if(customersList.isEmpty()) throw new SwiggyException("Empty customer list") ;
	return customersList ;
	}



}