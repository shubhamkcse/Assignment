package com.example.SmallWebApp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {

	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping(value = {"/api/", "/api/{id}"})
	public Person getDefaultEmployeesByIdWithOptional(@PathVariable Optional<Long> id) {
		Person person = new Person();
		if (id.isPresent()) {
			person = personRepository.findById(id.get()).get();
			return person;

		} else {
			return person;
		}
	}
	
	@GetMapping("/")
	public List<Person> getAllPerson()
	{
		return personRepository.findAll();
	}
	
	
	
//	@RequestMapping("/")
//	public Person requestPerson(@RequestBody Person person)
//	{
//		return personRepository.save(person);
//	}
	
	@PostMapping("/")
	public Person savePerson(@RequestBody Person person)
	{
		return personRepository.save(person);
	}
	
	@PutMapping("/")
	public Person updatePerson(@RequestBody Person person)
	{
		return personRepository.save(person);
	}
	
	@DeleteMapping("/{id}")
	public String deletePerson(@PathVariable Long id) {
		personRepository.deleteById(id);
		return "deleted Successfully";
	}
}
