package com.example.spring.service;

import java.util.List;
import java.util.Optional;

import com.example.spring.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public Optional<Employee> getIDEmp(Long id);
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(Employee employee);

}