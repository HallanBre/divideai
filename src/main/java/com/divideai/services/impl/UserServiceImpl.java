package com.divideai.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divideai.Entities.User;
import com.divideai.repository.UserRepository;
import com.divideai.services.UserService;
import com.google.common.base.Preconditions;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

	@Override
	public User save(User user) {
		Preconditions.checkNotNull(user, "The user is required to save. ");
		return repository.save(user);
	}
	
	@Override
	public User deleteBy(Integer id) {
		Preconditions.checkNotNull(id, "The id is required to delete user. ");
		return repository.deleteBy(id);
	}
	@Override
	public User findBy(Integer id) {
		Preconditions.checkNotNull(id, "The id is required to find user. ");
		return repository.findBy(id);
	}

	@Override
	public User login(String email, String password) {
		Preconditions.checkNotNull(email, "The email is required for login .");
		Preconditions.checkNotNull(password, "The password is required for login. ");
		User findedUser = repository.login(email, password);
		Preconditions.checkNotNull(findedUser, "The password or email is incorrect. ");
		return findedUser;
	}

}
