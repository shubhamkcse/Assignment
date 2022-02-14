package com.example.Spring.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.model.Address;
import com.example.Spring.repository.AddressRepository;

@RestController
@RequestMapping("/address")
public class AddressRestController {

	@Autowired
	private AddressRepository addressRepo;
	
	@GetMapping("/all")
	public List<Address> getallDetails()
	{
		return addressRepo.findAll();
	}
	
	@PostMapping("/save")
	public Address saveDetails(@RequestBody Address address)
	{
		return addressRepo.save(address);
	}
	
	@PutMapping("/update")
	public Address updateDetails(@RequestBody Address address)
	{
		return addressRepo.save(address);
	}
	
	@DeleteMapping("delete")
	public String deleteDetails(@RequestBody Address address)
	{
		addressRepo.save(address);
		return "delete done"+address;
	}
	
}
