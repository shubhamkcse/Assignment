package com.example.web;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@AutoConfigureBefore
public class Human {

	
	public void wakeup() {
		System.out.println("Good Morning!");
	}
}
