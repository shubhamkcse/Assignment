package com.example.web.service;

import java.util.List;

import com.example.web.model.Product;

public interface ProductService {
	public List<Product> listProducts();
	public Product saveProduct(Product product);
	public Product updateProduct(Product product);
	public String deleteProduct(Product product);
}