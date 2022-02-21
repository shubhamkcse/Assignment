package com.example.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.model.Teacher;
import com.example.spring.repository.TeacherRepository;
import com.example.spring.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepository repository;

	@Override
	public List<Teacher> listTeachers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return repository.save(teacher);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return repository.save(teacher);
	}

	@Override
	public String deleteTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		repository.delete(teacher);
		return "delete done";
	}
}
