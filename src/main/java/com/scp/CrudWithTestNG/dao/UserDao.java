package com.scp.CrudWithTestNG.dao;

import java.util.List;

import com.scp.CrudWithTestNG.entity.User;

public interface UserDao {
	
	public int addUser(User user);
	public User getUser(int id); 
	public List<User> getAllUsers();
	public int updateUser(User user);
	public void delete(int id);
	public User search(User user);

}
