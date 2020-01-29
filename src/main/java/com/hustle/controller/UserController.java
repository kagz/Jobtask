package com.hustle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hustle.model.User;
import com.hustle.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public User addUserPost(@RequestBody User user) {
		return userService.save(user);
	}

	@RequestMapping("/list")
	public List<User> getUserList() {
		return userService.findAll();
	}



	@RequestMapping("/{id}")
	public User getUser(@PathVariable("id") Long id) {
		User user = userService.findOne(id);
		return user;
	}
	
	@RequestMapping("/remove/{id}")
	public  void deleteUser(@PathVariable("id") Long id) {
		User user = userService.removeOne(id);
		return;
	}

}
