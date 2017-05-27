package com.test.app.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.test.app.vo.User;

public class PlatformUser extends org.springframework.security.core.userdetails.User {

	private static final long serialVersionUID = 1L;
	
	private User user;
	
	public PlatformUser(User user) {
		super(user.getTelephone(),user.getPassword(), obtainGrantedAuthorities());
		this.user = user;
	}

	private static Set<GrantedAuthority> obtainGrantedAuthorities() {
		Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>();
		authSet.add(new SimpleGrantedAuthority("ROLE_USER"));
		return authSet;
	}

	public User getUser() {
		return user;
	}
}
