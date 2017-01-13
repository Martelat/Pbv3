package org.proxibanquev3.service;

import org.proxibanquev3.dao.UserDao;
import org.proxibanquev3.domaine.User;

public class UserService {

	public void createUser(User user) {
		UserDao userDao = new UserDao();
		userDao.create(user);

	}

}
