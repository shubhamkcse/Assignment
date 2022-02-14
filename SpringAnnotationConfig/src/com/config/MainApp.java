package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
		Book book = (Book) ac.getBean("mybookbean");
		System.out.println(book);
		
		Author author = (Author) ac.getBean("authorbean");
		System.out.println(author);
	}
}