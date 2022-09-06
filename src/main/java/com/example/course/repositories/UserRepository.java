package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.UserTest;

public interface UserRepository extends JpaRepository<UserTest, Long>{
		
}
