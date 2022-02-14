package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=(Employee) ac.getBean("employee");
		emp.showEmp();
		
		Laptop lap=(Laptop) ac.getBean("laptop");
		lap.showLaptop();
	}
}