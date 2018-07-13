package com.scp.CrudWithTestNG.dao.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.scp.CrudWithTestNG.dao.UserDao;
import com.scp.CrudWithTestNG.entity.User;
import com.scp.CrudWithTestNG.util.HIbernateUtil;

public class UserDaoImpl implements UserDao{
	
	SessionFactory sf = HIbernateUtil.getSessionFactory();
	Session session = sf.openSession();

	public int addUser(User user) {
		return (Integer) session.save(user);
	}

	public User getUser(int id) {
		return session.get(User.class, id);
	}

	public List<User> getAllUsers() {
		return session.createQuery("From User").list();
	}

	public int updateUser(User user) {
		session.update(user);
		return user.getId();
	}

	public void delete(int id) {
		session.delete(id);
		
	}

	public User search(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
