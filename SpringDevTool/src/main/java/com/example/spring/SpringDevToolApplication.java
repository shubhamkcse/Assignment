package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDevToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDevToolApplication.class, args);
		int x=500;
		System.out.println("Hello "+x);
	}

}
