package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
