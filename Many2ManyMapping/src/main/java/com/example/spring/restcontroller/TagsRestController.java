package com.example.spring.restcontroller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Tag;
import com.example.spring.serviceimpl.TagsServiceImpl;

@RestController
@RequestMapping("/tags")
public class TagsRestController {

	@Autowired
	private TagsServiceImpl tagsServiceImpl;
	
	@GetMapping("/")
	public List<Tag> getAllTags()
	{
		return tagsServiceImpl.listTags();
		//return "done";
	}
	
	@PostMapping("/")
	public Tag saveTags(@RequestBody Tag tags)
	{
		return tagsServiceImpl.saveTags(tags);
	}
	
	@PutMapping("/")
	public Tag updateTags(@RequestBody Tag tags)
	{
		
		return tagsServiceImpl.updateTags(tags);
		//System.out.println("Done"+tag);
		// tag;
	}
	
	@DeleteMapping("/")
	public String deleteTags(@RequestBody Tag tags)
	{
		 tagsServiceImpl.deleteTags(tags);
		 return "delete done";
	}
}