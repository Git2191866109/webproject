package com.weibo.dashboard.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weibo.dashboard.dao.UserMapper;
import com.weibo.dashboard.entity.User;
import com.weibo.dashboard.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	public User select(String name) {
		return userMapper.select(name);
	}

	public int userNameExits(String name) {
		return userMapper.userNameExits(name);
	}

	public boolean accountValid(User user) {
		return userMapper.accountValid(user)>0;
	}

	public int insert(User user) {
		return userMapper.insert(user);
	}

}
