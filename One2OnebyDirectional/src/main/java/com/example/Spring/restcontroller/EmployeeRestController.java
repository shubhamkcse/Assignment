package com.example.Spring.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.modle.Employee;
import com.example.Spring.service.EmployeeService;
@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public List<Employee> findEmp()
	{
		return employeeService.lisEmployees();
	}
	
	@PostMapping("/")
	public Employee storeEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping("/")
	public String destroyEmployee(@RequestBody Employee employee)
	{
		employeeService.deleteEmployee(employee);
		return "delete Done";
	}
}
