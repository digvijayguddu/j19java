package com.services;

import java.util.List;

import com.model.Customer;

public interface CustomerService{
	void addCustomer();
	
	void delete();
	String deleteCustomer(int id);
//	Customer updateCustomer(Customer customer);
	
	Customer addoneCustomer (Customer customer);
	List<Customer> savedCustomer(List<Customer> customer);
	
	Customer getCustomerById(int id);
	
	Customer updateCustomer(Customer customer);
	
	List<Customer>getCustomer();
	
	Customer getCustomerByname(String name);
	
}
