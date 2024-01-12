package com.divideai.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divideai.Entities.User;
import com.divideai.dto.Login;
import com.divideai.services.UserService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	@Qualifier("userServiceProxy")
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<?> login(@RequestBody Login login) {
		String email = login.getEmail();
	    String password = login.getPassword();
	    User foundUser = userService.login(email, password);
		return ResponseEntity.ok(URI.create("/users/id/" + foundUser.getId()));
	}
}
