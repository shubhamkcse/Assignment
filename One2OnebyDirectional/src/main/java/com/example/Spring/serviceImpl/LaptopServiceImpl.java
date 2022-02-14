package com.example.Spring.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Spring.modle.Laptop;

@Service
public interface LaptopServiceImpl{

	  public Laptop saveLaptop(Laptop laptop);
	    public List<Laptop> listLaptop();
	    public Laptop updateLaptop(Laptop laptop);
	    public String deleteLaptop(Laptop laptop);
}
