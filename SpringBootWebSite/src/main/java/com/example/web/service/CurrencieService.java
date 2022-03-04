package com.example.web.service;

import java.util.List;

import com.example.web.model.Currencie;

public interface CurrencieService {
	public List<Currencie> listCurrencie();
	public Currencie saveCurrencie(Currencie currencie);
	public Currencie updateCurrencie(Currencie currencie);
	public String deleteCurrencie(Currencie currencie);
}