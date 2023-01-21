package com.luv2code.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomer() {
		return customerDAO.getCustomers();
		
	}
	
	@Override
	@Transactional
	public void addCustomer(Customer theCustomer){
		customerDAO.addCustomer(theCustomer);
	}
	
	@Override
	@Transactional
	public Customer getCustomer(int theCustomer) {
		return customerDAO.getCustomer(theCustomer);
		
	}
	
	@Override
	@Transactional
	public void deleteCustomer(int theCustomer) {
		customerDAO.deleteCustomer(theCustomer);
	}
		
	
	
}
