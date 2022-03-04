package com.example.web.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.model.Countrie;
import com.example.web.serviceimpl.CountrieServiceImpl;

@RestController
@RequestMapping("/countries/")
public class CountrieRestController {

	@Autowired
	private CountrieServiceImpl countrieServiceImpl;
	
	@GetMapping("/")
	public List<Countrie> getAllCountries()
	{
		return countrieServiceImpl.listCountries();
	}
	
	@PostMapping("/")
	public Countrie savedataCountrie(@RequestBody Countrie countrie)
	{
		return countrieServiceImpl.saveCountrie(countrie);
	}
	@PutMapping("/")
	public Countrie updatedataCountrie(@RequestBody Countrie countrie)
	{
		return countrieServiceImpl.updateCountrie(countrie);
	}
	@DeleteMapping("/")
	public String deletedataCountrie(@RequestBody Countrie countrie)
	{
		countrieServiceImpl.deleteCountrie(countrie);
		return "done";
	}
}
