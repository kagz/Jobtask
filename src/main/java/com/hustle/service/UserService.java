package com.hustle.service;

import java.util.List;

import com.hustle.model.User;

public interface UserService {

	List<User> findAll();

	User findOne(Long id);

	User save(User user);

	void removeOne(Long id);
}
