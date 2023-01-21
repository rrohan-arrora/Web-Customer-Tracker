package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		
		// get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Customer> theQuery = session.createQuery("from Customer order by lastName", Customer.class);
		
		// get the list of customers: execute query
		List<Customer> theCustomers = theQuery.getResultList();
		
		// return the results
		return theCustomers;
	}
	
	@Override
	public Customer getCustomer(int theCustomer) {
		
		// get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		// create a query
		Customer customer = session.get(Customer.class, theCustomer);
		
		
		// return the results
		return customer;
	}

	@Override
	public void addCustomer(Customer theCustomer) {
		
		// get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		// save the customer
		session.saveOrUpdate(theCustomer);
		
		
	}
}
