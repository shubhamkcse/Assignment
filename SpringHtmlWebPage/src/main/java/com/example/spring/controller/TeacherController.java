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

import com.example.spring.model.Teacher;
import com.example.spring.repository.TeacherRepository;

@Controller
@RequestMapping("/main/")
public class TeacherController {

	@Autowired
	private TeacherRepository teacherRepository;

	@GetMapping("teach-list")
	public String getAllTeachers(Model model) {
		model.addAttribute("teachers", teacherRepository.findAll());
		return "teacher_list";
	}

	@GetMapping("teach-add")
	public String showSignUpForm(Teacher teacher) {
		return "add-staff";
	}

	@PostMapping("teach-add")
	public String saveCourses(@Valid Teacher teacher, Model model, BindingResult result) {
		if (result.hasErrors()) {
			return "add-staff";
		}

		teacherRepository.save(teacher);
		return "redirect:teach-list";
	}

	@GetMapping("teach-edit/{id}")
	public String showUpdateForm(@PathVariable("id") Long id, Model model) {
		Teacher teacher = teacherRepository.getById(id);
		model.addAttribute("teacher", teacher);
		return "update-teacher";
	}

	@PostMapping("teach-update/{id}")
	public String updateCourse(@PathVariable("id") Long id, Model model, @Valid Teacher teacher, BindingResult result) {
		if (result.hasErrors()) {
			teacher.setStaffId(id);
			return "update-teacher";
		}
		teacherRepository.save(teacher);
		model.addAttribute("courses", teacherRepository.findAll());
		return "teacher_list";
	}

	@GetMapping("teach-delete/{id}")
	public String deleteCouse(@PathVariable("id") Long id, Model model) {
		Optional<Teacher> teacher = teacherRepository.findById(id);
		teacherRepository.deleteById(id);
		model.addAttribute("teachers", teacherRepository.findAll());
		return "teacher_list";
	}
}
