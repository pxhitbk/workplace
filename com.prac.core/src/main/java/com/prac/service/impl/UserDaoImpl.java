package com.prac.service.impl;

import javax.persistence.Query;

import com.prac.core.model.User;
import com.prac.service.UserDao;

public class UserDaoImpl extends GenericDaoImpl implements UserDao {

	@Override
	public User findUserByUsernameAndPassword(String username, String password) {
		Query query = getEntityManager().createQuery("SELECT u FROM User u WHERE u.username = ?1 and u.password = ?2");
		query.setParameter(1, username);
		query.setParameter(2, password);
		User user = (User) query.getSingleResult();
		return user;
	}

}
