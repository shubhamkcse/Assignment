package com.example.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring.modle.Laptop;
import com.example.Spring.repository.LaptopRepository;
import com.example.Spring.serviceImpl.LaptopServiceImpl;

@Service
public class LaptopService implements LaptopServiceImpl{
	
	@Autowired
	private LaptopRepository laptopRepository;
	
	@Override
	public Laptop saveLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public List<Laptop> listLaptop() {
		// TODO Auto-generated method stub
		return laptopRepository.findAll();
	}

	@Override
	public Laptop updateLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public String deleteLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		laptopRepository.delete(laptop);
		return "delete done"+laptop;
	}

}
