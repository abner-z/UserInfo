package com.abner.dao.iface;

import java.util.List;

import com.abner.modle.User;

public interface UserDAO {
	void addUser(User user);
	void delectUser(User user);
	void updateUser(User user);
	List<User> getAllUser();
	List<User> getUserByName(String userName);
	List<User> getUserById(String id);
	int getMaxId();
}
