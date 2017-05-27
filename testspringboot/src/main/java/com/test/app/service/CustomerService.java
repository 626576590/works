package com.test.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.app.mapper.UserMapper;
import com.test.app.vo.User;

@Service
public class CustomerService {
	
	  @Autowired
	  private UserMapper userMapper;
	  
	  public List<User> findUser(){
		  return userMapper.findUser();
	  }
		
}
