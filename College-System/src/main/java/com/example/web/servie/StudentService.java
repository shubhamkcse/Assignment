package com.example.web.servie;

import java.util.List;

import com.example.web.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public String deleteStudent(Integer id);
}
