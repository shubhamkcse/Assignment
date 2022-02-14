package com.example.Spring.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.modle.Laptop;
import com.example.Spring.service.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopRestController {

	@Autowired
	private LaptopService laptopService;
	
	@GetMapping("/")
	public List<Laptop> findEmp()
	{
		return laptopService.listLaptop();
	}
	
	@PostMapping("/")
	public Laptop storeEmployee(@RequestBody Laptop laptop)
	{
		return laptopService.saveLaptop(laptop);
	}
}
