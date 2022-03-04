package com.example.spring.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Student;
import com.example.spring.serviceimpl.StudentServiceImpl;

@RestController
public class StudentRestController {

	@Autowired
	private StudentServiceImpl serviceImpl;
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return serviceImpl.listStudents();
	}
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student)
	{
		return serviceImpl.saveStudent(student);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student)
	{
		return serviceImpl.updateStudent(student);
	}
	
	@DeleteMapping("/students")
	public String deleteStudent(@RequestBody Student student)
	{
		serviceImpl.deleteStudent(student);
		return "delete done";
	}
	
}
