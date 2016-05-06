package com.abner.web.action;

import com.abner.modle.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserInfo extends ActionSupport implements ModelDriven<User> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	
	public String login() {
		
		return "index";
	}
	
	
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
