package com.example.Spring.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.model.Page;
import com.example.Spring.serviceImpl.PageServiceImpl;

@RestController
@RequestMapping("/page")
public class PageRestController {

	@Autowired
	private PageServiceImpl pageServiceImpl;
	
	@GetMapping("/")
	public List<Page> getAllPage()
	{
		return pageServiceImpl.listPage();
	}
	
	@PostMapping("/")
	public Page savePage(@RequestBody Page page)
	{
		return pageServiceImpl.savePage(page);
	}
	
	@PutMapping("/")
	public Page updatePage(@RequestBody Page page)
	{
		return pageServiceImpl.updatePage(page);
	}
	
	@DeleteMapping("/")
	public String deletePage(@RequestBody Page page)
	{
		pageServiceImpl.deletePage(page);
		return "delete done"+page;
	}
}
