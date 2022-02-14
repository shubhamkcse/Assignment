package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Brand;
import com.example.demo.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandRestController {

	@Autowired
	private BrandService brandService;
	
	@GetMapping("/")
	public List<Brand> getALlBrands()
	{
		return brandService.add();
	}
	
	@PostMapping("/")
	public Brand saveBrand(@RequestBody Brand brand)
	{
		return brandService.saveBrand(brand);
	}
	
	@PutMapping("/")
	public Brand updateBrand(@RequestBody Brand brand)
	{
		return brandService.updateBrand(brand);
	}
	
	@DeleteMapping("/")
	public String Brand(@RequestBody Brand brand)
	{
		return brandService.deleteBrand(brand);
	}
}
