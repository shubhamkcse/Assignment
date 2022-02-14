package com.example.Spring.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.model.Book;
import com.example.Spring.serviceImpl.BookServiceImpl;

@RestController
@RequestMapping("/book")
public class BookRestController {

	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@GetMapping("/")
	public List<Book> findAllBook()
	{
		return bookServiceImpl.listBook();
	}
	
	@PostMapping("/")
	public Book storeBook(@RequestBody Book book)
	{
		return bookServiceImpl.saveBook(book);
	}
	
	@PutMapping("/")
	public Book updateBook(@RequestBody Book book)
	{
		return bookServiceImpl.updateBook(book);
	}
	
	@DeleteMapping("/")
	public String deleteBook(@RequestBody Book book)
	{
		bookServiceImpl.deleteBook(book);
		return "delete Done"+book;
	}
	
}
