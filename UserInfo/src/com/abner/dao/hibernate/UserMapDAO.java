package com.abner.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.abner.dao.iface.UserDAO;
import com.abner.modle.User;

public class UserMapDAO extends HibernateDaoSupport implements UserDAO {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
	}

	@Override
	public void delectUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		String sql = "from user order by userName";
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) getHibernateTemplate().find(sql);
		return list;
	}

	@Override
	public List<User> getUserByName(String userName) {
		// TODO Auto-generated method stub
		String sql = "from user where username like "+userName ;
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) getHibernateTemplate().find(sql);
		return list;
	}

	@Override
	public List<User> getUserById(String id) {
		// TODO Auto-generated method stub
		String sql = "from user where id = " +id;
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) getHibernateTemplate().find(sql);
		return list;
	}

	@Override
	public int getMaxId() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) getHibernateTemplate().find("from user");
		return list.size();
	}

}
