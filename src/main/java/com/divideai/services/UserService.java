package com.divideai.services;

import org.springframework.validation.annotation.Validated;

import com.divideai.Entities.User;

import jakarta.validation.constraints.NotNull;

@Validated
public interface UserService {

	public User save(
			@NotNull(message = "The user is required. ") 
			User user);

	public User deleteBy(
			@NotNull(message = "The id is required. ") 
			Integer id);

	public User findBy(
			@NotNull(message = "The id is required. ") 
			Integer id);
}
