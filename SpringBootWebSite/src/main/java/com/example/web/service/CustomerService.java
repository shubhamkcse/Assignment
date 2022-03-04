package com.example.web.service;

import java.util.List;

import com.example.web.model.Customer;

public interface CustomerService {

	public List<Customer> listCustomers();
	public Customer saveCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public String deleteCustomer(Customer customer);
}
