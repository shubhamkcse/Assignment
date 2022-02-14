package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {

	@Bean(initMethod = "initalize", destroyMethod = "deleting", name = "mybookbean")
	@Scope("singleton")
	public Book getBookBean()
	{
		return new Book();
	}
	
	@Bean(name = "authorbean")
	@Scope("prototype")
	public Author getAuthorBean()
	{
		return new Author();
	}
}
