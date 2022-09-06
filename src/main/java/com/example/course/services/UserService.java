package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.UserTest;
import com.example.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<UserTest> findAll() {
		return repository.findAll();
	}
	
	public UserTest findById(Long id) {
		Optional<UserTest> obj = repository.findById(id);
		return obj.get();
	}
}
