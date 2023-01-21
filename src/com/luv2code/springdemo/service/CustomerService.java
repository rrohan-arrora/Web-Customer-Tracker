package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {
	
	
	public List<Customer> getCustomer();
	public void addCustomer(Customer theCustomer);
	public Customer getCustomer(int theCustomer);

}
