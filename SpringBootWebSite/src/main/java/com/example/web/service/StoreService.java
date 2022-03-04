package com.example.web.service;

import java.util.List;

import com.example.web.model.Store;

public interface StoreService {
	public List<Store> listStores();
	public Store saveStore(Store store);
	public Store updateStore(Store store);
	public String deleteStore(Store store);
}