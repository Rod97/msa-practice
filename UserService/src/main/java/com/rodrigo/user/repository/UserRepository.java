package com.rodrigo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(Long userId);

}
