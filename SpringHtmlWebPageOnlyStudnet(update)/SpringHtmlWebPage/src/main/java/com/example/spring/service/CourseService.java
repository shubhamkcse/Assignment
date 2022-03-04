package com.example.spring.service;

import java.util.List;

import com.example.spring.model.Course;

public interface CourseService {

	public List<Course> listCourse();
	public Course saveCourse(Course course);
	public Course updateCourse(Course course);
	public String deleteCourse(Course course);
}