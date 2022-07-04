package com.example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.service.ServiceLayer;

@RestController
public class HomeController {

	private final ServiceLayer serviceLayer;
	
	@Autowired
	public HomeController(ServiceLayer serviceLayer) {
		super();
		this.serviceLayer = serviceLayer;
	}
	
	@GetMapping("/home")
	public String home()
	{
		return serviceLayer.getProxytest();
	}
}	
