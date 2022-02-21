package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Course;
import com.example.spring.model.Teacher;
import com.example.spring.serviceimpl.TeacherServiceImpl;

@RestController
public class TeacherRestController {

	@Autowired
	private TeacherServiceImpl teacherServiceImpl;
	
	@GetMapping("/")
	public List<Teacher> getAllList()
	{
		return teacherServiceImpl.listTeachers();
	}
	
	@PostMapping("/")
	public Teacher saveTeacher(@RequestBody Teacher teacher)
	{
		return teacherServiceImpl.saveTeacher(teacher);
	}
	
	@PutMapping("/")
	public Teacher updateTeacher(@RequestBody Teacher teacher)
	{
		return teacherServiceImpl.updateTeacher(teacher);
	}
	
	@DeleteMapping("/")
	public String deleteTeacher(@RequestBody Teacher teacher)
	{
		teacherServiceImpl.deleteTeacher(teacher);
		return "delete done";
	}
}
