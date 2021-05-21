package com.rodrigo.user.posts.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.user.posts.entity.Post;

@Repository
public interface PostsRepository extends JpaRepository<Post,Long>{

	Post findByPostId(Long id);
	
	ArrayList<Post> findAllByUserId(Long userId);
}
