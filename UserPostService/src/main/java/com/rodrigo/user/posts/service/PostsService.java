package com.rodrigo.user.posts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.user.posts.entity.Post;
import com.rodrigo.user.posts.repository.PostsRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostsService {
	
	@Autowired
	private PostsRepository postsRepository;

	public Post savePost(Post post) {
		log.info("Inside createPost method in PostsRepository");
		return postsRepository.save(post);
	}

	public Post findByPostId(Long id) {
		log.info("Inside findPostByID method in PostsRepository");
		return postsRepository.findByPostId(id);
	}
	
	

}
