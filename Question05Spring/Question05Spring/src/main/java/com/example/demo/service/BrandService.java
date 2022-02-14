package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Brand;
import com.example.demo.repository.BrandRepository;
import com.example.demo.serviceImpl.BrandServiceImpl;

@Service
public class BrandService implements BrandServiceImpl{

	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public List<Brand> add() {
		// TODO Auto-generated method stub
		return brandRepository.findAll();
	}

	@Override
	public Brand saveBrand(Brand brand) {
		// TODO Auto-generated method stub
		return brandRepository.save(brand);
	}

	@Override
	public Brand updateBrand(Brand brand) {
		// TODO Auto-generated method stub
		return brandRepository.save(brand);
	}

	@Override
	public String deleteBrand(Brand brand) {
		// TODO Auto-generated method stub
		brandRepository.delete(brand);
		return "delete Done";
	}

}
