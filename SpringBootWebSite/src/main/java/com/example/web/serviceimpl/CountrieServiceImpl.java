package com.example.web.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.model.Countrie;
import com.example.web.repository.CountrieRepository;
import com.example.web.service.CountrieService;
@Service
public class CountrieServiceImpl implements CountrieService{

	@Autowired
	private CountrieRepository countrieRepository;
	
	@Override
	public List<Countrie> listCountries() {
		// TODO Auto-generated method stub
		return countrieRepository.findAll();
	}

	@Override
	public Countrie saveCountrie(Countrie countrie) {
		// TODO Auto-generated method stub
		return countrieRepository.save(countrie);
	}

	@Override
	public Countrie updateCountrie(Countrie countrie) {
		// TODO Auto-generated method stub
		return countrieRepository.save(countrie);
	}

	@Override
	public String deleteCountrie(Countrie countrie) {
		// TODO Auto-generated method stub
		countrieRepository.delete(countrie);
		return "delete done";
	}

}
