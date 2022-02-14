package com.example.demo.serviceImpl;

import java.util.List;

import com.example.demo.model.Brand;

public interface BrandServiceImpl {

	public List<Brand> add();
	public Brand saveBrand(Brand brand);
	public Brand updateBrand(Brand brand);
	public String deleteBrand(Brand brand);
	
}
