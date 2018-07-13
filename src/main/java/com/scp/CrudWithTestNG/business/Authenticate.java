package com.scp.CrudWithTestNG.business;

import java.util.List;

import com.scp.CrudWithTestNG.entity.User;
import com.scp.CrudWithTestNG.service.UserService;
import com.scp.CrudWithTestNG.service.impl.UserServiceImpl;

public class Authenticate {
	
	
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		User user = new User(5,"Swap7709", "pwd1234" );
		User user1 = new User(5,"Swap7709", "pwd1234" );
		User user2 = new User(5,"Swap7709", "pwd1234" );
		
		//add
		userService.addUser(user);
		userService.addUser(user1);
		userService.addUser(user2);

		//update
		user2.setUserId("Swap1234");
		user2.setPassword("Password5678");
		System.out.println("Updated User Id :"+userService.updateUser(user2));
		
		//delete
		userService.delete(user.getId());
		
		//getAll users
		System.out.println("List Of All users");
		List<User> users = userService.getAllUsers();
		for (User u : users) {
			System.out.println("Id : " +u.getId()+" UName : "+u.getUserId() +" Password "+u.getPassword());
		}
		
		authenticate("Swap1234","Password5678");

	}
	
	public static void authenticate(String userName, String password){
		
		UserService userService = new UserServiceImpl();
		
		User user = new User(userName, password);
		User foundUser = userService.search(user);
		
		if(null == foundUser){
			System.out.println("Invalid User Name");
			return;
		}
		
		else if(!user.getPassword().equals(foundUser.getPassword())){
			System.out.println("Invalid Password");
		}
		
		else if(user.getPassword().equals(foundUser.getPassword())){
			System.out.println("User Authentication Successfull");
		}		
	}
}
