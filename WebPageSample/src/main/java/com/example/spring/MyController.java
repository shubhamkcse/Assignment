package com.example.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/home")
	public String page()
	{
		return "";
	}
	
	@GetMapping
	 public String myPage(Model model) {
	        model.addAttribute("myobj", "Tarkeshwar Barua");
	        List<Book> books = new ArrayList<>();
	        Book b1=new Book();
	        b1.setAuthor("Tarkeshwar");
	        b1.setId(1);
	        b1.setTitle("Mobile Application Development");
	        Book b2=new Book();
	        b2.setAuthor("Barua");
	        b2.setId(2);
	        b2.setTitle("Machine Learning using Python");
	        books.add(b1);
	        books.add(b2);
	        model.addAttribute("mybooks", books);
	        return "home";
	    }
}