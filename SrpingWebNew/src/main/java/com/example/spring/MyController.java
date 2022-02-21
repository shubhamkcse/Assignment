package com.example.spring;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
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
		String url = "https://gorest.co.in/public/v2/posts";
		return restTemplate.getForEntity(url, String.class).getBody();
//		HttpHeaders httpHeaders = new HttpHeaders();
//		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		//HttpEntity<String> entity = new HttpEntity<String>(httpHeaders);
		//HttpEntity<Employee> entitys=new HttpEntity<Employee>(httpHeaders);
		//return restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();

		//return restTemplate.getForEntity(url, String.class).getBody();
		//return restTemplate.getForEntity(url, List<Employes>.class).getBody();
	}
}
