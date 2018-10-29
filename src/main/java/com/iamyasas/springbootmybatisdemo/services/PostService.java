package com.iamyasas.springbootmybatisdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamyasas.springbootmybatisdemo.mappers.PostMapper;
import com.iamyasas.springbootmybatisdemo.models.Post;

@Service
public class PostService {
	
	@Autowired
	private PostMapper mapper;

	public Post[] getPosts(int pageNo) {
		return mapper.getPosts(10 * (pageNo - 1));
	}

}
