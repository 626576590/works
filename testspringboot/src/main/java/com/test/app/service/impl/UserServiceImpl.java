package com.test.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.app.mapper.UserMapper;
import com.test.app.service.UserService;
import com.test.app.vo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findAccount(String account) {
		return userMapper.findAccount(account);
	}

	@Override
	public User findTelephone(String telephone) {
		System.out.println("UserServiceImpl.findTelephone()"+telephone);
		return userMapper.findTelephone(telephone);
	}

}
