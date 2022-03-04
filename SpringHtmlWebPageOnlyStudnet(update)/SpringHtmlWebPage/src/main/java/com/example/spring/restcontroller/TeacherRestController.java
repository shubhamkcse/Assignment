package com.example.spring.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Teacher;
import com.example.spring.serviceimpl.TeacherServiceImpl;

@RestController
public class TeacherRestController {

	@Autowired
	private TeacherServiceImpl teacherServiceImpl;
	
	@GetMapping("/Teachers")
	public List<Teacher> getAllTeachers()
	{
		return teacherServiceImpl.listTeachers();
	}
	
	@PostMapping("/Teachers")
	public Teacher saveDataTeacher(@RequestBody Teacher teacher)
	{
		return teacherServiceImpl.saveTeacher(teacher);
	}
	
	@PutMapping("/Teachers")
	public Teacher updateDataTeacher(@RequestBody Teacher teacher)
	{
		return teacherServiceImpl.updateTeacher(teacher);
	}
	
	@DeleteMapping("/Teachers")
	public String deleteDataTeacher(@RequestBody Teacher teacher)
	{
		teacherServiceImpl.deleteTeacher(teacher);
		return "delete done"; 
	}
}
