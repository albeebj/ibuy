package com.ibuy.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.ibuy.bean.*;
import com.ibuy.dao.UserDAO;
import com.opensymphony.xwork2.ActionContext;
public class LoginService {
	
	private UserDAO userDao;
	
	public UserDAO getUserDao() {
		return userDao;
	}
	
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	public String isValid(User user) {
		List result = userDao.findByExample(user);
		User userList = (User)result.get(0);
		if (result.size() > 0) {
			int status = userList.getStatus();
			if(status == 1){
				return "success";
			}
			else
				return "unvarified";
		}
		else return "failer";
	}
}

