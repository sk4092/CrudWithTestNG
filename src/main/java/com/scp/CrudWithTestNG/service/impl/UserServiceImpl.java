package com.scp.CrudWithTestNG.service.impl;

import java.util.List;

import com.scp.CrudWithTestNG.dao.UserDao;
import com.scp.CrudWithTestNG.dao.daoImpl.UserDaoImpl;
import com.scp.CrudWithTestNG.entity.User;
import com.scp.CrudWithTestNG.service.UserService;

public class UserServiceImpl implements UserService{

	UserDao userDao = new UserDaoImpl();
	
	public int addUser(User user) {
		return userDao.addUser(user);
	}

	public User getUser(int id) {
		return userDao.getUser(id);
	}

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

	public void delete(int id) {
		userDao.delete(id);
		
	}

	public User search(User user) {
		return userDao.search(user);
	}

}
