package com.example.spring.service;

import java.util.List;
import java.util.Set;

import com.example.spring.model.Tag;

public interface TagsService {

	public List<Tag> listTags();
	public Tag saveTags(Tag tags);
	public Tag updateTags(Tag tags);
	public String deleteTags(Tag tags);
}
