package fr.objis.proxibanquev2.service;

import fr.objis.proxibanquev2.dao.UserDao;
import fr.objis.proxibanquev2.domaine.User;

public class UserService {
	
	public void createUser(User user){
		UserDao userDao = new UserDao();
		userDao.create(user);

	}
	

	
}
