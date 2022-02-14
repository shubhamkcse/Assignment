package com.example.demo.serviceImpl;

import java.util.List;

import com.example.demo.model.Laptop;

public interface LaptopServiceImpl {

	public List<Laptop> add();
	public Laptop saveLaptop(Laptop laptop);
	public Laptop updateLaptop(Laptop laptop);
	public String deleteLaptop(Laptop laptop);
}
