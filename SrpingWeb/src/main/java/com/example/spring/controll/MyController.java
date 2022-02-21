package com.example.spring.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	public String greeting()
	{
		return "yes, new rest api is working";
	}
	
	@GetMapping("/consume")
	public String consumeRest()
	{
		String url="https://gorest.co.in/public/v2/posts";
		return restTemplate.getForEntity(url, String.class).getBody();
		//return restTemplate.getForEntity(url, List<Employes>.class).getBody();
	}
}

