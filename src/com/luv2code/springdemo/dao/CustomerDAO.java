package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	
	public Customer getCustomer(int theCustomer);
	
	public void addCustomer(Customer theCustomer);
	
	public void deleteCustomer(int theCustomer);
	
}
