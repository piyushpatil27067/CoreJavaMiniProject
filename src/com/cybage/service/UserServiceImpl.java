package com.cybage.service;

import java.util.List;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao=new UserDaoImpl();
	

	@Override
	public List<User> getAllUsers() {
	 return userDao.getAllUsers();
	}

	

}
