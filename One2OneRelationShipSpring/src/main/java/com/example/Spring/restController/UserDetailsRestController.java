package com.example.Spring.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.model.UserDetails;
import com.example.Spring.repository.UserDetailRepository;

@RestController
@RequestMapping("/user")
public class UserDetailsRestController {

	@Autowired
	private UserDetailRepository repo;
	
	@GetMapping("/all")
	public List<UserDetails> getallUser()
	{
		return repo.findAll();
	}
	
	@PostMapping("/save")
	public UserDetails saveDetails(@RequestBody UserDetails details)
	{
		return repo.save(details);
	}
	
	@PutMapping
	public UserDetails updateDetails(@RequestBody UserDetails details)
	{
		return repo.save(details);
	}
	
	@DeleteMapping
	public String deleteDetails(@PathVariable Long id)
	{
		repo.deleteById(id);
		return "delete Successfully";
		
	}
}
