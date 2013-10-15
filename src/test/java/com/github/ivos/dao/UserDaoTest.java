package com.github.ivos.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.ivos.model.User;

public class UserDaoTest {

	static ApplicationContext spring = new ClassPathXmlApplicationContext("spring/application-context.xml");
	UserDao dao;

	@Before
	public void setup() {
		dao = spring.getBean(UserDao.class);
	}

	@Test
	public void create() {
		User user = new User();
		user.setId(123);

		user = dao.create(user);
	}

}
