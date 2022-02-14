package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Laptop;
import com.example.demo.repository.LaptopRepository;
import com.example.demo.serviceImpl.LaptopServiceImpl;

@Service
public class LaptopService implements LaptopServiceImpl{

	@Autowired
	private LaptopRepository laptopRepository;
	
	@Override
	public List<Laptop> add() {
		// TODO Auto-generated method stub
		return laptopRepository.findAll();
	}

	@Override
	public Laptop saveLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
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
		return "Delete Done";
	}

}
