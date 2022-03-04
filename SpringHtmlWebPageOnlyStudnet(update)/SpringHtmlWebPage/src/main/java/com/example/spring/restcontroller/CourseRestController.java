package com.example.spring.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Course;
import com.example.spring.serviceimpl.CourseServiceImpl;

@RestController
public class CourseRestController {

	@Autowired
	private CourseServiceImpl courseServiceImpl;
	
	@GetMapping("/courses")
	public List<Course> getAllCourses()
	{
		return courseServiceImpl.listCourse();
	}
	
	@PostMapping("/courses")
	public Course savaDataCourse(@RequestBody Course course)
	{
		return courseServiceImpl.saveCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateDataCourse(@RequestBody Course course)
	{
		return courseServiceImpl.updateCourse(course);
	}
	
	@DeleteMapping("/courses")
	public String deleteDataCourse(@RequestBody Course course)
	{
		courseServiceImpl.deleteCourse(course);
		return "delete done";
	}
}
