package com.masai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.masai.model.Customer;

public interface customerRepository extends JpaRepository<Customer, Integer> , PagingAndSortingRepository<Customer, Integer>{

}
