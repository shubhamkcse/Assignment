package com.example.web.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AppProxy {

	private final RestTemplate restTemplate;

	@Autowired
	public AppProxy(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	@Retryable(maxAttempts = 2,value = Exception.class,
			backoff = @Backoff(multiplier = 3))
	public String test()
	{
		System.out.println("hello retries");
		if(true)
			throw new NullPointerException();
		return restTemplate.getForObject("http://httpbin.org/delay/4", String.class);
	}
}
