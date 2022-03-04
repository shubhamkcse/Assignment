package com.example.web.service;

import java.util.List;

import com.example.web.model.Countrie;

public interface CountrieService {

	public List<Countrie> listCountries();
	public Countrie saveCountrie(Countrie countrie);
	public Countrie updateCountrie(Countrie countrie);
	public String deleteCountrie(Countrie countrie);
}
