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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.model.Course;
import com.example.spring.model.Student;
import com.example.spring.repository.CourseRepository;
import com.example.spring.serviceimpl.CourseServiceImpl;

@Controller
@RequestMapping("/main/")
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;

	@GetMapping("course-list")
	public String getAllCourses(Model model) {
		model.addAttribute("courses", courseRepository.findAll());
		return "course-details";
	}
	
	@GetMapping("c-add")
	public String showSignUpForm(Course course) {
		return "add-course";
	}

	@PostMapping("course-add")
	public String saveCourses(@Valid Course course, Model model, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "add-course";
		}
		
		courseRepository.save(course);
		return "redirect:course-list";
	}

	@GetMapping("course-edit/{id}")
	public String showUpdateForm(@PathVariable("id") Long id,Model model)
	{
		Course course=courseRepository.getById(id);
		model.addAttribute("course", course);
		return "update-course";
	}
	
	@PostMapping("course-update/{id}")
	public String updateCourse(@PathVariable("id") Long id, Model model,@Valid Course course, BindingResult result)
	{
		if(result.hasErrors())
		{
			course.setId(id);
			return "update-course";
		}
		courseRepository.save(course);
		model.addAttribute("courses", courseRepository.findAll());
		return "course-details";
	}
	
	@GetMapping("course-delete/{id}")
	public String deleteCouse(@PathVariable("id") Long id, Model model)
	{
		Optional<Course> course = courseRepository.findById(id);
		courseRepository.deleteById(id);
		model.addAttribute("courses", courseRepository.findAll());
		return "course-details";
	}
}
