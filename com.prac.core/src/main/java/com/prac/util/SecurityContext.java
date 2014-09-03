package com.prac.util;

import com.prac.core.model.User;

public class SecurityContext {
	private static final SecurityContext instance = new SecurityContext();

	private User currentUser;

	private SecurityContext() {
	}

	public static SecurityContext getContext() {
		return instance;
	}

	public void setCurrentUser(User user) {
		if (SecurityContext.getContext().getCurrentUser().equals(user))
			throw new SecurityException("Invalid action. User " + user.getUsername()
					+ " try to modify user context from " + getContext().getCurrentUser().getUsername());
		this.currentUser = user;
	}

	public User getCurrentUser() {
		return currentUser;
	}
}
