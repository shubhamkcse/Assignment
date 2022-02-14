package com.example.spring.restcontroller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Post;
import com.example.spring.serviceimpl.PostsServiceImpl;

@RestController
@RequestMapping("/posts")
public class PostsRestController {

	@Autowired
	private PostsServiceImpl postsServiceImpl;
	
	@GetMapping("/")
	public List<Post> getAllPosts()
	{
		return postsServiceImpl.listPosts();
		//return "done";
	}
	
	@PostMapping("/")
	public Post savePosts(@RequestBody Post posts)
	{
		return postsServiceImpl.savePosts(posts);
	}
	
	@PutMapping("/")
	public Post updatePosts(@RequestBody Post posts)
	{
		return postsServiceImpl.updatePosts(posts);
	}
	
	@DeleteMapping("/")
	public String deletePosts(@RequestBody Post posts)
	{
		 postsServiceImpl.deletePosts(posts);
		 return "delete done";
		
	}
}