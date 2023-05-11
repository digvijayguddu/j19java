package com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustRepo;
import com.model.Customer;


@Service
public class CustomerServiceimpl {
	
	@Autowired
	CustRepo CustomerRepo;
	
	public void addCustomer()
	{
		ArrayList<Customer> cust = new ArrayList<Customer>();
		{
			cust.add(new Customer("Digvijay",21));
			cust.add(new Customer("Shravan",22));
			cust.add(new Customer("Pratham",23));
			cust.add(new Customer("Gpay",24));
			
			for(Customer c:cust)
				CustomerRepo.save(c);
		}
	}
	
//	public void delete()
//	{
//		CustomerRepo.deleteAll();
//	}
	public String deleteCustomer(int id)
	{
		CustomerRepo.deleteById(id);
		return "Customer removed"+id;
	}

	public Customer addoneCustomer(Customer customer)
	{
		return CustomerRepo.save(customer);
	}
	
	public List<Customer> savedCustomer(List<Customer> customer)
	{
		return CustomerRepo.saveAll(customer);
	}
	public Customer getCustomerById(int id)
	{
		return CustomerRepo.findById(id).orElse(null);
	}
	
	public Customer updateCustomer(Customer customer)
	{
		Customer existingCustomer = CustomerRepo.findById(customer.getId()).orElse(null);
		existingCustomer.setName(customer.getName());
		//existingcustomer.setAmmount(customer.getAmmount());
		return CustomerRepo.save(existingCustomer);
		
	}
	public List<Customer>getCustomer()
	{
		return CustomerRepo.findAll();	}
	
	public Customer getCustomerByname(String name)
	{
		return CustomerRepo.findByName(name);
	}
	
}
