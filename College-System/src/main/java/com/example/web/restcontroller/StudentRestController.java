package com.example.web.restcontroller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.model.Student;
import com.example.web.servieImpl.StudentServiceImpl;

@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class StudentRestController {
	
	@Autowired
	private StudentServiceImpl serviceImpl;
	
	@GetMapping("/list")
	public List<Student> getRecords()
	{
		return serviceImpl.getAllStudents();
	}
	
	@PostMapping("/save")
	public Student saveRecords(@RequestBody Student student)
	{
		return serviceImpl.saveStudent(student);
	}
	
	@PutMapping("/update")
	public Student updateRecords(@RequestBody Student student)
	{
		return serviceImpl.updateStudent(student);
	}
	
	@DeleteMapping("/delete")
	public void deleteRecords(@PathParam("id") Integer id)
	{
		serviceImpl.deleteStudent(id);
	}
}