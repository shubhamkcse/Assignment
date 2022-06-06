package com.example.web.servieImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.model.Student;
import com.example.web.repo.StudentRepo;
import com.example.web.servie.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	
	private StudentRepo studentRepo;

	@Autowired
	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public String deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		return "Delete records";
	}
	
}
