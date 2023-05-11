package com.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Customer;

public interface CustRepo extends JpaRepository<Customer, Integer> {

	Customer findByName(String name);
	

}
