package com.masai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Customer;
import com.masai.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
