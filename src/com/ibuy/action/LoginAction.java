package com.ibuy.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.ibuy.bean.User;
import com.ibuy.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	private boolean result;
	private String email;
	private short status;
	private Timestamp created_time;
	private Timestamp updated_time;
	private LoginService loginService;

	
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public String getUsername() {
		return username;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(short status) {
		this.status = status;
	}
	public Timestamp getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Timestamp created_time) {
		this.created_time = created_time;
	}
	public Timestamp getUpdated_time() {
		return updated_time;
	}
	public void setUpdated_time(Timestamp updated_time) {
		this.updated_time = updated_time;
	}
	
	public String execute() throws Exception {  
	     //System.out.println("Message: TestAction!");  
	     //return "success";
		 
		 User user = new User();
		 user.setUsername(username);
		 user.setPassword(password);
		 this.result = loginService.isValid(user);
		 
	     if(this.result){
	    	 return "success";
	     }else{
	    	 return "failer";
	     }
    }  
}

