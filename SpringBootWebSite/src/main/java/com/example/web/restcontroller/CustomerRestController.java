package com.example.web.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.model.Customer;
import com.example.web.serviceimpl.CustomerServiceImpl;

@RestController
@RequestMapping("/customers/")
public class CustomerRestController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	@GetMapping("/")
	public List<Customer> getallCustomers()
	{
		return customerServiceImpl.listCustomers();
	}
	
	
	@PostMapping("/")
	public Customer savedataCustomer(@RequestBody Customer customer)
	{
		return customerServiceImpl.saveCustomer(customer);
	}
	
	@PutMapping("/")
	public Customer updatedataCustomer(@RequestBody Customer customer)
	{
		return customerServiceImpl.updateCustomer(customer);
	}
	
	@DeleteMapping("/")
	public String deletedataCustomer(@RequestBody Customer customer)
	{
		customerServiceImpl.deleteCustomer(customer);
		return "done";
	}
}
