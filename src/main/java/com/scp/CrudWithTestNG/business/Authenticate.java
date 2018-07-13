package com.scp.CrudWithTestNG.business;

import com.scp.CrudWithTestNG.entity.User;
import com.scp.CrudWithTestNG.service.UserService;
import com.scp.CrudWithTestNG.service.impl.UserServiceImpl;

public class Authenticate {
	
	
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		User user = new User(1, "Swapnil", "pwd1234" );
		userService.addUser(user);

	}
	
	
	

}
