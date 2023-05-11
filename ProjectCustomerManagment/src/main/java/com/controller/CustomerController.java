package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.services.CustomerServiceimpl;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerServiceimpl cusSericeServiceimpl;
	
	@PostMapping("/add")
	public String saveCustomer()
	{
		cusSericeServiceimpl.addCustomer();
		return "Add";
	}

//	@DeleteMapping("/delete")
//	public String delete() {
//		cusSericeServiceimpl.delete();
//		return "Deleted";
//	}
	
	@DeleteMapping("/delete/{id}")
	public String delCustomer(@PathVariable int id) {
		cusSericeServiceimpl.deleteCustomer(id);
		return "Deleted";
}
	
	@PostMapping("/addCustomer")
	
	public Customer saveCostomer(@RequestBody Customer customer)
	{
		return cusSericeServiceimpl.addoneCustomer(customer);
	}
	
	@PostMapping("/addCustomers")
	public List<Customer> savedCustomer(@RequestBody List<Customer> customer)
	{
		return cusSericeServiceimpl.savedCustomer(customer);
	}
	@GetMapping("/search/{id}")
	public Customer findCustomerById(@PathVariable int id)
	{
		return cusSericeServiceimpl.getCustomerById(id);
	}
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return cusSericeServiceimpl.updateCustomer(customer);
	}
	@GetMapping("/customers")
	public List<Customer>findAllCustomers()
	{
		return cusSericeServiceimpl.getCustomer();
	}
	
	@GetMapping("/{name}")
	public Customer findCustomerByName(@PathVariable String name)
	{
		return cusSericeServiceimpl.getCustomerByname(name);
	}
}