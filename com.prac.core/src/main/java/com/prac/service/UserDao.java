package com.prac.service;

import com.prac.core.model.User;

public interface UserDao extends GenericDao {
	public User findUserByUsernameAndPassword(String username, String password);
}
