package com.example.spring.serviceimpl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.model.Post;
import com.example.spring.repository.PostsRepository;
import com.example.spring.service.PostsService;

@Service
public class PostsServiceImpl implements PostsService{

	@Autowired
	private PostsRepository postsRepository;
	@Override
	public List<Post> listPosts() {
		// TODO Auto-generated method stub
		return postsRepository.findAll();
		//return "done";
	}

	@Override
	public Post savePosts(Post posts) {
		// TODO Auto-generated method stub
		return postsRepository.save(posts);
	}

	@Override
	public Post updatePosts(Post posts) {
		// TODO Auto-generated method stub
		return postsRepository.save(posts);
	}

	@Override
	public String deletePosts(Post posts) {
		// TODO Auto-generated method stub
		postsRepository.delete(posts);
		return "delete done";
	}

}
