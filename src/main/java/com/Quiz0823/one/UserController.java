package com.Quiz0823.one;

import com.Quiz0823.one.domain.User;
public class UserController {
	UserService userservice;

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	
	public User getUser()
	{
		return userservice.getUserById(2L);
	}
	
	
}
