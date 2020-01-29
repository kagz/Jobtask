package com.hustle.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hustle.model.User;
import com.hustle.repository.UserRepository;
import com.hustle.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	// get all users
	public List<User> findAll() {
		List<User> userList = (List<User>) userRepository.findAll();

		List<User> activeBookList = new ArrayList<>();

		for (User user : userList) {
			if (user.isActive()) {
				activeBookList.add(user);
			}
		}

		return activeBookList;
	}

	public User findOne(Long id) {
		return userRepository.findOne(id);
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public User removeOne(Long id) {
		userRepository.delete(id);
		return null;
	}
}
