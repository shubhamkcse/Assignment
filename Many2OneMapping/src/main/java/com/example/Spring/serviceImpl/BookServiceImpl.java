package com.example.Spring.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring.model.Book;
import com.example.Spring.repository.BookRepository;
import com.example.Spring.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> listBook() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public String deleteBook(Book book) {
		// TODO Auto-generated method stub
		bookRepository.delete(book);
		return "Delete Done"+book;
	}

}
