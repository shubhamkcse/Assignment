package com.example.Spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneRestController {

	@Autowired
	PhoneRepository repo;
	
	@GetMapping("/")
	public List<Phone> getallDetails()
	{
		return repo.findAll();
	}
	
	@PostMapping("/")
	public Phone saveDetails(@RequestBody Phone phone)
	{
		return repo.save(phone);
	}
	
	@PutMapping("/")
	public Phone updateDetails(@RequestBody Phone phone)
	{
		return repo.save(phone);
	}
	
	@DeleteMapping("/")
	public String deleteDetails(@RequestBody Phone phone)
	{
		repo.delete(phone);
		return "Delete Successfully";
	}
}
