package com.prac.service.impl;

import com.prac.core.model.User;
import com.prac.service.AuthenticationService;
import com.prac.service.UserDao;
import com.prac.util.SecurityContext;

public class AuthenticationServiceImpl implements AuthenticationService {

	private UserDao userDao;

	@Override
	public boolean authenticate(String username, String password) {
		User user = userDao.findUserByUsernameAndPassword(username, password);
		if (user == null)
			return false;
		SecurityContext.getContext().setCurrentUser(user);
		return true;
	}

}
