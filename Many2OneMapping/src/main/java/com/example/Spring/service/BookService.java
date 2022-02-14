package com.example.Spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Spring.model.Book;

public interface BookService {
	
	public List<Book> listBook();
	public Book saveBook(Book book);
	public Book updateBook(Book book);
	public String deleteBook(Book book);
}
