package com.springwuelevateproject.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.springwuelevateproject.praveen.model.User;

public interface UserRepository 
extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
	
}