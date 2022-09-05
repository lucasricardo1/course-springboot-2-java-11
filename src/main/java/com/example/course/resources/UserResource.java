package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.UserTeste;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<UserTeste> findAll(){
		UserTeste u = new UserTeste(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
