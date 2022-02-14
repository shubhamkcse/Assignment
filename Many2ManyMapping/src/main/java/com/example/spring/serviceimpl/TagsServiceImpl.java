package com.example.spring.serviceimpl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.model.Tag;
import com.example.spring.repository.TagsRepository;
import com.example.spring.service.TagsService;

@Service
public class TagsServiceImpl implements TagsService{

	@Autowired
	private TagsRepository tagsRepository;
	
	@Override
	public List<Tag> listTags() {
		// TODO Auto-generated method stub
		return tagsRepository.findAll();
		//return "done";
	}

	@Override
	public Tag saveTags(Tag tags) {
		// TODO Auto-generated method stub
		return tagsRepository.save(tags);
	}

	@Override
	public Tag updateTags(Tag tags) {
		// TODO Auto-generated method stub
		return tagsRepository.save(tags);
	}

	@Override
	public String deleteTags(Tag tags) {
		// TODO Auto-generated method stub
		tagsRepository.delete(tags);
		return "delete done";
	}

}
