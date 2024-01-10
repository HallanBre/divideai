package com.divideai.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divideai.Entities.User;
import com.divideai.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	@Qualifier("userServiceProxy")
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<?> insert(@RequestBody User user) {
		User savedUser = userService.save(user);
		return ResponseEntity.created(URI.create("/user/id/" + savedUser.getId())).build();
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<?> findBy(@PathVariable("id") Integer id) {
		User findedUser = userService.findBy(id);
		return ResponseEntity.ok(findedUser);
	}
	
	@DeleteMapping("/id/{id}")
	public ResponseEntity<?> deleteBy(@PathVariable("id") Integer id) {
		User deletedUser = userService.deleteBy(id);
		return ResponseEntity.ok(deletedUser);
	}

}