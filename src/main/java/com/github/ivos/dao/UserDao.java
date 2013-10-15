package com.github.ivos.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.ivos.model.User;

public class UserDao {

	Logger logger = LoggerFactory.getLogger(UserDao.class);

	public User create(User user) {
		logger.trace("In create...");
		return user;
	}

}
