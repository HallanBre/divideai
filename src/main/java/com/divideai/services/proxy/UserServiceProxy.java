package com.divideai.services.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divideai.Entities.User;
import com.divideai.services.UserService;

@Service
public class UserServiceProxy implements UserService {
	
	@Autowired
	private UserService userService;

	@Override
	public User save(User user) {
		//TODO when the user saves, send an email stating that they created or updated a account
		return userService.save(user);
	}

	@Override
	public User deleteBy(Integer id) {
		return userService.deleteBy(id);
	}

	@Override
	public User findBy(Integer id) {
		return userService.findBy(id);
	}

	@Override
	public User login(String email, String password) {
		return userService.login(email, password);
	}

}
