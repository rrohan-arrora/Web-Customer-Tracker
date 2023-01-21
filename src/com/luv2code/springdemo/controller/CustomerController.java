package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from DAO
		List<Customer> customers = customerService.getCustomer();
		
		// add those customers to the model
		theModel.addAttribute("customers", customers);
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		theModel.addAttribute("addUpdateCustomer", new Customer());
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String processForm(@ModelAttribute("addUpdateCustomer") Customer theCustomer,
			BindingResult theBindingResult, Model theModel) {
				
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		
		// save the customer
		customerService.addCustomer(theCustomer);
//		theModel.addAttribute("customer", theCustomer);
		
		return "redirect:/customer/list";
		
//		return "customer-confirmation";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {
		
		// get the customer from the database
		Customer theCustomer = customerService.getCustomer(theId);
		
		// set the customer as a model attribute to prepoluate the form
		theModel.addAttribute("addUpdateCustomer", theCustomer);
		// send over to our form
		
		return "customer-form";
	}
	
	

}
