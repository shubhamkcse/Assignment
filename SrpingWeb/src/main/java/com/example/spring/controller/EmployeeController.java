package com.example.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.model.Employee;
import com.example.spring.repository.EmployeeRepository;
import com.example.spring.serviceimpl.EmployeeServiceImpl;

@Controller
@RequestMapping("/emp/")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl serviceImpl;
	@Value("${myapp.title}") //accepting value from properties file
	private String pageTitle;
	
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping(value = {"/","index"})
	public String indexPage(Model model)
	{
		model.addAttribute("titleofPage",pageTitle);
		//model.addAttribute("msg", "Welcome to Home page");
		return "home";
	}
	
	@GetMapping("list")
	public String getAllList(Model model)
	{
		List<Employee> employees=serviceImpl.getAllEmployees();
		model.addAttribute("employee_list", employees);
		//return serviceImpl.getAllEmployees()
		//model.addAttribute("msg", "Listing Records");
		return "emp_details";
	}
	
	@GetMapping("add")
	public String addEmployee(Model model)
	{
		Employee employees= new Employee();
		model.addAttribute("employee_add", employees);
		//return serviceImpl.getAllEmployees()
		model.addAttribute("msg", "Add Records");
		return "registration_page";
	}
	
	@PostMapping("save")
	public String saveEmployee(Model model, @ModelAttribute("add_employee") Employee employee)
	{
		System.out.println(employee);
		model.addAttribute("msg", "Save Records");
		try {
			repository.save(employee);
		} catch (Exception e) {
			// TODO: handle exception
			return "home";
		}
		return "home";
	}
	
	
	@GetMapping("edit/{id}")
	public String editEmployee(@PathVariable("id") Long id, Model model)
	{
		Optional<Employee> employee= repository.findById(id);
		model.addAttribute("employee", employee);
		return "update-employee";
	}
	
	@PostMapping("update/{id}")
	public String updateEmployee(Model model, @PathVariable("id") Long id, BindingResult result, Employee employee)
	{
		
		  if (result.hasErrors()) {
			  employee.setId(id);
	            return "update-student";
	        }

	        repository.save(employee);
	        model.addAttribute("employees", repository.findAll());
	        return "index";
		//Employee employees= repository.findById(id).get();
		//model.addAttribute("employee_add", employees);
		//model.addAttribute("msg", "UIpdated Records");
		//return "redirect:/registration_page";
		//return "index";
	}
	
	@GetMapping("delete/{id}")
	public String deleteEmployee(@PathVariable("id") Long id, Model model)
	{
		Optional<Employee> employee = repository.findById(id);
		repository.deleteById(id);
		//model.addAttribute("msg", "Record Deleted"+id);
		model.addAttribute("employees", repository.findAll());
		return "index";
	}
	
//	@GetMapping("/{id}")
//	public Optional<Employee> getIdEmployee(Model model,@PathVariable Long id)
//	{
//		return serviceImpl.getIDEmp(id);
//	}
//	
//	@PostMapping("/")
//	public Employee saveEmployee(Model model,@RequestBody Employee employee)
//	{
//		return serviceImpl.saveEmployee(employee);
//	}
//
//	@PutMapping("/")
//	public Employee updateEmployee(Model model,@RequestBody Employee employee)
//	{
//		return serviceImpl.updateEmployee(employee);
//	}
//	
//	@PutMapping("/{id}")
//	public Optional<Employee> findByEmployee(Model model,@PathVariable Long id)
//	{
//		return repository.findById(id);
//	}
//	
//	@DeleteMapping("/")
//	public String deleteEmployee(Model model,@RequestBody Employee employee)
//	{
//		serviceImpl.deleteEmployee(employee);
//		return "Delete Done";
//	}
//	
//	@DeleteMapping("/{id}")
//	public String deleteByIdEmployee(Model model,@PathVariable Long id)
//	{
//		repository.deleteById(id);
//		return "Delete Employee";
//	}

}
