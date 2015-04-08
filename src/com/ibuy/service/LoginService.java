package com.ibuy.service;

import java.util.List;

import com.ibuy.bean.*;
import com.ibuy.dao.UserDAO;
public class LoginService {
	
	private UserDAO userDao;
	
	public UserDAO getUserDao() {
		return userDao;
	}
	
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	public boolean isValid(User user) {
		List result = userDao.findByExample(user);
		if (result.size() > 0) return true;
		else return false;
	}
}

