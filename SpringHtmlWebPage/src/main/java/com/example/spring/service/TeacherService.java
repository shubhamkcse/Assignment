package com.example.spring.service;

import java.util.List;

import com.example.spring.model.Teacher;

public interface TeacherService {

	public List<Teacher> listTeachers();
	public Teacher saveTeacher(Teacher teacher);
	public Teacher updateTeacher(Teacher teacher);
	public String deleteTeacher(Teacher teacher);
	
}