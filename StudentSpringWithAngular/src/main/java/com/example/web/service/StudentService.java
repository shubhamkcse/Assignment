package com.example.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.web.model.Student;
import com.example.web.repository.StudentRepositry;

@Service
public class StudentService {

	@Autowired
	private StudentRepositry studentRepositry;
	
	public List<Student> findAllStudents()
	{
		return studentRepositry.findAll();
	}
	
	public Student registerStudent(Student student)
	{
		return studentRepositry.save(student);
	}	
	
	public Student UpdateStudent(Student student)
	{
		Integer rollNumber=student.getRollNumber();
		Student std=studentRepositry.findById(rollNumber).get();
		std.setName(student.getName());
		std.setAddress(student.getAddress());
		std.setPercentage(student.getPercentage());
		return studentRepositry.save(std);
	}
	
	public void deleteStudent(Integer id)
	{
		studentRepositry.deleteById(id);
	}
}