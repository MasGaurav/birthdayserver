package com.birthday.service;

import com.birthday.model.User;
import com.birthday.model.UserRole;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface UserService {
	//creating user
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

	//get user by username
	public User getUser(String username);

	//delete user by id

	public void deleteUser(Long userId);
}
