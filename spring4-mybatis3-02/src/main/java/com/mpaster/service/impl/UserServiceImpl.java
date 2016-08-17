package com.mpaster.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mpaster.dao.UserMapper;
import com.mpaster.model.User;
import com.mpaster.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User getUserById(int userId) {
		return this.userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public void addUser(User user) {
		this.userMapper.insert(user);
	}

	@Override
	public void deleteUser(int userId) {
		this.userMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public void updateUser(User user) {
		this.userMapper.updateByPrimaryKey(user);
	}

	@Override
	public List<User> getAll() {
		return this.userMapper.selectAll();
	}

}
