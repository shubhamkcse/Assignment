package com.example.Spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.Spring.model.Page;


public interface PageService {

	public List<Page> listPage();
	public Page savePage(Page page);
	public Page updatePage(Page page);
	public String deletePage(Page page);
}
