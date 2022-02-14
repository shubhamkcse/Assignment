package com.example.Spring.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Spring.modle.Employee;

@Service
public interface EmployeeServiceImpl {
	
	public Employee saveEmployee(Employee employee);
	public List<Employee> lisEmployees();
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(Employee employee);
}