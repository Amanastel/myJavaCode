package com.masai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Customer;
import com.masai.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
