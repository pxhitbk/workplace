package com.prac.service;

import javax.transaction.Transactional;

@Transactional
public interface AuthenticationService {
	public boolean authenticate(String username, String password);
}
