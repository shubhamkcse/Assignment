package com.example.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
