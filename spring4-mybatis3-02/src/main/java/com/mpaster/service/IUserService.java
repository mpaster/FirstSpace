package com.mpaster.service;

import java.util.List;

import com.mpaster.model.User;

public interface IUserService {

	User getUserById(int userId);
	
	void addUser(User user);
	
	void deleteUser(int userId);
	
	void updateUser(User user);
	
	List<User> getAll();
}
