package com.example.web.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.model.Student;
import com.example.web.service.StudentService;

@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class StudentRestController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getStudents")
	public List<Student> listStudents()
	{
		return studentService.findAllStudents();
	}
	
	@PostMapping("/registerStudent")
	public Student registerStd(@RequestBody Student student)
	{
		return studentService.registerStudent(student);
	}
	
	@PutMapping("/updateStudents")
	public Student registerStdUpdate(@RequestBody Student student)
	{
		return studentService.UpdateStudent(student);
	}
	
	@DeleteMapping("/deleteStudent")
	public void deletStudentData(@RequestParam Integer id)
	{
		studentService.deleteStudent(id);
	}
}