package com.example.spring.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Employee;
import com.example.spring.repository.EmployeeRepository;
import com.example.spring.serviceimpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@Autowired
	private EmployeeServiceImpl serviceImpl;
	
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping("/")
	public List<Employee> getAllList()
	{
		return serviceImpl.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> getIdEmployee(@PathVariable Long id)
	{
		return serviceImpl.getIDEmp(id);
	}
	
	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return serviceImpl.saveEmployee(employee);
	}

	@PutMapping("/")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return serviceImpl.updateEmployee(employee);
	}
	
	@PutMapping("/{id}")
	public Optional<Employee> findByEmployee(@PathVariable Long id)
	{
		return repository.findById(id);
	}
	
	@DeleteMapping("/")
	public String deleteEmployee(@RequestBody Employee employee)
	{
		serviceImpl.deleteEmployee(employee);
		return "Delete Done";
	}
	
	@DeleteMapping("/{id}")
	public String deleteByIdEmployee(@PathVariable Long id)
	{
		repository.deleteById(id);
		return "Delete Employee";
	}
}