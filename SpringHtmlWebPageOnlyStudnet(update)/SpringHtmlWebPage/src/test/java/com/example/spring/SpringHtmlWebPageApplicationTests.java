package com.example.spring;

import static org.assertj.core.api.Assertions.assertThat;

import javax.validation.constraints.AssertFalse;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring.controller.StudentController;
import com.example.spring.model.Student;
import com.example.spring.repository.StudentRepository;
import com.example.spring.restcontroller.StudentRestController;

@SpringBootTest
class SpringHtmlWebPageApplicationTests {

	//@Autowired
	//private MyController mycontroller;
	
	@Test
	void contextLoads() {
		assertThat(restController.getAllStudents().size()).isEqualTo(1);
		//assertThat(mycontroller).isNotNull();
		//assertThat(mycontroller.showUpdateForm()).isEqualTo("Shubham");
	}
	@Test
	void contextLoads1() {
		assertThat(repository.findAll().get(0)).isEqualTo(new Student());
		assertThat(repository);
		//assertThat(restController.getAllStudents().get(0)).isEqualTo(new Student();
	}
	
	@Autowired
	private StudentRestController restController;
	
	@Autowired
	private StudentRepository repository;
}
