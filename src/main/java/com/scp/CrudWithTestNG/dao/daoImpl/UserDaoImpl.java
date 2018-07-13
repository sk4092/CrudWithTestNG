package com.scp.CrudWithTestNG.dao.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.scp.CrudWithTestNG.dao.UserDao;
import com.scp.CrudWithTestNG.entity.User;
import com.scp.CrudWithTestNG.util.HIbernateUtil;

public class UserDaoImpl implements UserDao{
	
	SessionFactory sf = HIbernateUtil.getSessionFactory();
	Session session ;

	public int addUser(User user) {
		session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return user.getId();
	}

	public User getUser(int id) {
		session = sf.openSession();
		User user = session.get(User.class, id);
		session.close();
		return user;
	}

	public List<User> getAllUsers() {
		session = sf.openSession();
		return session.createQuery("From User").list();
	}

	public int updateUser(User user) {
		session = sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(user);
		session.getTransaction().commit();
		session.close();
		return user.getId();
	}

	public void delete(int id) {
				
		session = sf.openSession();
		session.beginTransaction();
		User user = session.load(User.class,id);
	    session.delete(user);
		session.getTransaction().commit();
		session.close();
		
	}

	public User search(User user) {
		session = sf.openSession();
		List<User> users = session.createQuery("From User where userId = '"+user.getUserId()+"'").list();
		if(users.size()>0){
			return users.get(0);
		}
		return null;
	}

}
