package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SpringBootAopApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootAopApplication.class, args);
	
		AbstractApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student s=con.getBean("student", Student.class);
		
		s.study();
	}

}
