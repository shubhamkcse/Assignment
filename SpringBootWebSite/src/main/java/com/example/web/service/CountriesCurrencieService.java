package com.example.web.service;

import java.util.List;

import com.example.web.model.CountriesCurrencie;

public interface CountriesCurrencieService {

	public List<CountriesCurrencie> listCounCurr();
	public CountriesCurrencie saveCounCurr(CountriesCurrencie countriesCurrencie);
	public CountriesCurrencie updateCounCurr(CountriesCurrencie countriesCurrencie);
	public String deleteCounCurr(CountriesCurrencie countriesCurrencie);
}
