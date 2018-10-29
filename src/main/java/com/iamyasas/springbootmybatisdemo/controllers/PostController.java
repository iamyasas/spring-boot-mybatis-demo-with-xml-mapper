package com.iamyasas.springbootmybatisdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iamyasas.springbootmybatisdemo.models.Post;
import com.iamyasas.springbootmybatisdemo.services.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	private PostService service;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping
	public Post[] getPosts(@RequestParam("pageNo") int pageNo) {
		return service.getPosts(pageNo);
	}
}