package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Laptop;
import com.example.demo.service.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopRestController {

	@Autowired
	private LaptopService laptopService;
	
	@GetMapping("/")
	public List<Laptop> getALlLaptops()
	{
		return laptopService.add();
	}
	
	@PostMapping("/")
	public Laptop saveLaptop(@RequestBody Laptop laptop)
	{
		return laptopService.saveLaptop(laptop);	
	}
	
	@PutMapping("/")
	public Laptop updateLaptop(@RequestBody Laptop laptop)
	{
		return laptopService.updateLaptop(laptop);	
	}
	
	@DeleteMapping("/")
	public String deleteLaptop(@RequestBody Laptop laptop)
	{
		laptopService.saveLaptop(laptop);	
		return "delete done";
	}
}
