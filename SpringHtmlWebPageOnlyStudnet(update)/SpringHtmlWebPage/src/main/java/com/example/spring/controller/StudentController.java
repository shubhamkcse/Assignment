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

import com.example.spring.model.Student;
import com.example.spring.repository.StudentRepository;
import com.example.spring.serviceimpl.StudentServiceImpl;

@Controller
@RequestMapping("/students/")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl impl;
	
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("s_signup")
	public String showSignUpForm(Student student) {
		return "add-student";
	}
	
	@GetMapping("s_list")
    public String showUpdateForm(Model model) {
		
        model.addAttribute("students", impl.listStudents());
        return "index";
    }

    @PostMapping("s_add")
    public String addStudent(@Valid Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-student";
        }

        impl.saveStudent(student);
        return "redirect:s_list";
    }

    @GetMapping("s_edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Student student = studentRepository.getById(id);//.orElseThrow(() - > new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("student", student);
        return "update-student";
    }

    @PostMapping("s_update/{id}")
    public String updateStudent(@PathVariable("id") Long id,@Valid Student student, BindingResult result,
        Model model) {
        if (result.hasErrors()) {
            student.setId(id);
            return "update-student";
        }

        studentRepository.save(student);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

    @GetMapping("s_delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id, Model model) {
        Optional<Student> student = studentRepository.findById(id);//.orElseThrow(() - > new IllegalArgumentException("Invalid student Id:" + id));
        studentRepository.deleteById(id);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }
}
