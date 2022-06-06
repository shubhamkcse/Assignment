package com.example.web.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.util.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.web.model.Product;
import com.example.web.repository.ProductRepository;
import com.example.web.service.ProductService;

import net.bytebuddy.utility.RandomString;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> viewAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> getByIdProduct(Integer productId) {
		// TODO Auto-generated method stub
		return productRepository.findById(productId);
	}

//	@Override
//	public Product viewProductByCategory(String name) {
//		// TODO Auto-generated method stub
//		return productRepository.getOne(name);
//	}

	@Override
	public void removeProduct(Integer productId) {
		// TODO Auto-generated method stub
		productRepository.deleteById(productId);
		//return "Deleted";
	}
	
	public List<Product> listAll(String keyword) {
        if (keyword != null) {
            return productRepository.search(keyword);
        }
        return productRepository.findAll();
    }
	
	public Product find(Integer id) {
		for (Product product : productRepository.findAll()) {
			if (product.getUniqueId().equals(id)) {
				return product;
			}
		}
		return null;
	}
	
	public Product saveProductToDB(MultipartFile file,Product product)
	{
		//Product p = new Product();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			product.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//product.setProductname(fileName);
        return productRepository.save(product);
	}
	
//	@Transactional
//	public String getUniqueIdentifier(String uniqueId) {
//		uniqueId = RandomString.getSecureRandomString();
//		while (productRepository.existsById(uniqueId)) {
//			uniqueId = RandomString.getSecureRandomString();
//		}
//		productRepository.save(new UniqueId(uniqueId));
//		return uniqueId;
//	}

}
