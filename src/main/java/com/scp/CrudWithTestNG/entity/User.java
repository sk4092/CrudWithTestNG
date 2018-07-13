package com.scp.CrudWithTestNG.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userLogin")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column(name="userName",nullable = false)
	String userId;
	
	@Column(name="password",nullable = false)
	String password;
	
	
	public User() {
		super();
	}
	
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	
	public User(int id, String userId, String password) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
