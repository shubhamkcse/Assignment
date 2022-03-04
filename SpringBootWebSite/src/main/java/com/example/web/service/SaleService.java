package com.example.web.service;

import java.util.List;

import com.example.web.model.Sale;

public interface SaleService {
	public List<Sale> listSales();
	public Sale saveSale(Sale sale);
	public Sale updateSale(Sale sale);
	public String deleteSale(Sale sale);
}