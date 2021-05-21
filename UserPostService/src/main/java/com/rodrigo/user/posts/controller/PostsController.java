package com.rodrigo.user.posts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.user.posts.entity.Post;
import com.rodrigo.user.posts.service.PostsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/posts")
@Slf4j
public class PostsController {

	@Autowired
	private PostsService postsService;

	@PostMapping("/")
	public Post savePost(@RequestBody Post post) {
		log.info("Inside savePost method in PostsController");
		return postsService.savePost(post);
	}

	@GetMapping("/{id}")
	public Post findByPostId(@PathVariable("id") Long id) {
		log.info("Looking for post " + id + ".");
		return postsService.findByPostId(id);
	}
}
