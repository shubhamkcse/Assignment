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

import com.example.web.model.Region;
import com.example.web.serviceimpl.RegionServiceImpl;

@RestController
@RequestMapping("/regions/")
public class RegionRestController {

	@Autowired
	private RegionServiceImpl regionServiceImpl;
	
	@GetMapping("/")
	public List<Region> getAllRegions()
	{
		return regionServiceImpl.listRegions();
	}
	
	@PostMapping("/")
	public Region savedataRegion(@RequestBody Region region)
	{
		return regionServiceImpl.saveRegion(region);
	}
	@PutMapping("/")
	public Region updatedataRegion(@RequestBody Region region)
	{
		return regionServiceImpl.updateRegion(region);
	}
	@DeleteMapping("/")
	public String deletedataRegion(@RequestBody Region region)
	{
		regionServiceImpl.deleteRegion(region);
		return "done";
	}
}
