package com.test.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

import com.test.app.service.UserService;
import com.test.app.vo.User;

@Component
public class UserDetailService implements UserDetailsService {
	
	
	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String accout)
			throws UsernameNotFoundException {
		System.out.println("UserDetailService.loadUserByUsername()"+accout);
		System.out.println("UserDetailService.loadUserByUsername()"+userService);
		if(StringUtils.isEmpty(accout)){
			System.out.println("用户错误!");
			//throw new UsernameNotFoundException("accout " + accout + " not found");
			return null;
		}else {
			User user = userService.findTelephone(accout);
			if(user == null){
				System.out.println("用户密码错误!");
				throw new UsernameNotFoundException("accout " + accout + " not found");
			}
			return new PlatformUser(user);
		}
	}

}
