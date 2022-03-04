package com.example.spring.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.model.Course;
import com.example.spring.repository.CourseRepository;
import com.example.spring.serviceimpl.CourseServiceImpl;

@Controller
@RequestMapping("/courses/")
public class CourseController {

	@Autowired
	private CourseServiceImpl courseServiceImpl;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping("c_signup")
	public String showSignUp(Course course) {
		return "add-course";
	}
	
	@GetMapping("c_list")
	public String listForm(Model model)
	{
		model.addAttribute("courses", courseRepository.findAll());
		return "course-details";
	}
	
	@PostMapping("c_add")
	public String addData(@Valid Course course, Model model, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "add-course";
		}
		courseServiceImpl.saveCourse(course);
		return "redirect:c_list";
	}
	
	@GetMapping("c_edit/{id}")
	public String editForm(@PathVariable("id") Long id, Model model)
	{
		Course course = courseRepository.getById(id);
		model.addAttribute("course", course);
		return "update-course";
	}
	
	@PostMapping("c_update/{id}")
	public String updateForm(@PathVariable("id") Long id, Model model, @Valid Course course, BindingResult result)
	{
		if(result.hasErrors())
		{
			course.setId(id);
			return "update-course";
		}
		
		courseServiceImpl.updateCourse(course);
		model.addAttribute("courses", courseRepository.findAll());
		return "course-details";
	}
	
	@GetMapping("c_delete/{id}")
	public String deleteForm(@PathVariable("id") Long id, Model model)
	{
		Optional<Course> course=courseRepository.findById(id);
		courseRepository.deleteById(id);
		model.addAttribute("courses", courseRepository.findAll());
		return "course-details";
	}
}
