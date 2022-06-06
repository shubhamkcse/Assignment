package com.example.web.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.model.Product;
import com.example.web.repository.ProductRepository;
import com.example.web.service.ProductServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;


import java.io.ByteArrayOutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.http.ResponseEntity.BodyBuilder;



@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class ProductRestController {
	
	
	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@GetMapping("/getProduct")
	public List<Product> displyDataProduct(){
		
		return productServiceImpl.viewAllProduct();
		
	}
	
	@PostMapping("/saveProduct")
	public Product addDataProduct(@RequestBody Product product)
	{
		return productServiceImpl.addProduct(product);
	}
	
	@PutMapping("/updateProduct")
	public Product updateDataProduct(@RequestBody Product product)
	{
		return productServiceImpl.updateProduct(product);
		
	}
	
	@DeleteMapping("/deleteProduct")
	public void removeDataProduct(@RequestParam Integer id)
	{
		productServiceImpl.removeProduct(id);
	}
	

//	@PostMapping("/upload")
//	public BodyBuilder uplaodImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
//
//		System.out.println("Original Image Byte Size - " + file.getBytes().length);
//		Product img = new Product(file.getOriginalFilename(), file.getContentType(),
//				compressBytes(file.getBytes()));
//		productRepository.save(img);
//		return ResponseEntity.status(HttpStatus.OK);
//	}
//
//	@GetMapping(path = { "/get/{imageName}" })
//	public Product getImage(@PathVariable("imageName") String imageName) throws IOException {
//
//		final Optional<Product> retrievedImage = productRepository.findByName(imageName);
//		Product img = new Product(retrievedImage.get().getName(), retrievedImage.get().getType(),
//				decompressBytes(retrievedImage.get().getImage()));
//		return img;
//	}
//
//	// compress the image bytes before storing it in the database
//		public static byte[] compressBytes(byte[] data) {
//			Deflater deflater = new Deflater();
//			deflater.setInput(data);
//			deflater.finish();
//
//			ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
//			byte[] buffer = new byte[1024];
//			while (!deflater.finished()) {
//				int count = deflater.deflate(buffer);
//				outputStream.write(buffer, 0, count);
//			}
//			try {outputStream.close();
//			} catch (IOException e) {
//			}
//			System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);
//
//			return outputStream.toByteArray();
//		}
//		
//		// uncompress the image bytes before returning it to the angular application
//		public static byte[] decompressBytes(byte[] data) {
//			Inflater inflater = new Inflater();
//			inflater.setInput(data);
//			ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
//			byte[] buffer = new byte[1024];
//			try {
//				while (!inflater.finished()) {
//					int count = inflater.inflate(buffer);
//					outputStream.write(buffer, 0, count);
//				}
//				outputStream.close();
//			} catch (IOException ioe) {
//			} catch (DataFormatException e) {}
//			return outputStream.toByteArray();
//		}
}
