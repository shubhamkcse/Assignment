package com.example.spring.controller;

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
import com.example.spring.serviceimpl.TeacherServiceImpl;

@Controller
@RequestMapping("/teachers/")
public class TeacherController {

	@Autowired
	private TeacherServiceImpl teacherServiceImpl;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@GetMapping("t_signup")
	public String singupForm(Teacher teacher)
	{
		return "add-staff";
	}
	
	@GetMapping("t_list")
	public String showList(Model model)
	{
		model.addAttribute("teachers", teacherServiceImpl.listTeachers());
		return "teacher_list";
	}
	
	@PostMapping("t_add")
	public String addStaff(Model model, @Valid Teacher teacher, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "add-staff";
		}
		teacherServiceImpl.saveTeacher(teacher);
		return "redirect:t_list";
	}
	
	@GetMapping("t_edit/{id}")
	public String editStaffForm(@PathVariable("id") Long id, Model model)
	{
		Teacher teacher=teacherRepository.getById(id);
		model.addAttribute("teacher", teacher);
		return "update-teacher";
	}
	
	@PostMapping("t_update/{id}")
	public String updateStaffForm(@PathVariable("id") Long id, @Valid Teacher teacher, Model model, BindingResult result)
	{
		if(result.hasErrors())
		{
			teacher.setStaffId(id);
			return "update-teacher";
		}
		teacherRepository.save(teacher);
		model.addAttribute("teachers", teacherServiceImpl.listTeachers());
		return "teacher_list";
	}
	
	@GetMapping("t_delete/{id}")
	public String deleteTeachForm(@PathVariable("id") Long id, Model model)
	{
		Teacher teacher=teacherRepository.getById(id);
		teacherRepository.deleteById(id);
		model.addAttribute("teachers", teacherServiceImpl.listTeachers());
		return "teacher_list";
	}
}
