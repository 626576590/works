package com.test.app.service;


import com.test.app.vo.User;

public interface UserService {
	
	User findAccount(String account);
	
	User findTelephone(String telephone);

}
