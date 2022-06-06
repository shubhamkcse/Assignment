package com.example.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.model.Student;

@Repository
public interface StudentRepositry extends JpaRepository<Student, Integer>{

}