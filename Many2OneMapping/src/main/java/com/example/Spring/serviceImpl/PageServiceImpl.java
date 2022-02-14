package com.example.Spring.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring.model.Page;
import com.example.Spring.repository.PageRepository;
import com.example.Spring.service.PageService;

@Service
public class PageServiceImpl implements PageService{

	@Autowired
	private PageRepository pageRepository;
	
	@Override
	public List<Page> listPage() {
		// TODO Auto-generated method stub
		return pageRepository.findAll();
	}

	@Override
	public Page savePage(Page page) {
		// TODO Auto-generated method stub
		return pageRepository.save(page);
	}

	@Override
	public Page updatePage(Page page) {
		// TODO Auto-generated method stub
		return pageRepository.save(page);
	}

	@Override
	public String deletePage(Page page) {
		// TODO Auto-generated method stub
		pageRepository.delete(page);
		return "Delete Done"+page;
	}

}
