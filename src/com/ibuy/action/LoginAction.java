package com.ibuy.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.ibuy.bean.User;
import com.ibuy.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String username;
	private String password;
	private String result;
	private String email;
	private short status;
	private Timestamp created_time;
	private Timestamp updated_time;
	private LoginService loginService;
	private Map session;

	
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
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
	     return "input";
   }
	
	public String login() throws Exception {  
	     //System.out.println("Message: TestAction!");  
	     //return "success";
		 
		 User user = new User();
		 user.setUsername(username);
		 user.setPassword(password);
		 result = loginService.isValid(user);
		 if(result == "success"){
			 this.session.put("user", user.getUsername());
		 }
		 
	     return "result";
    }
	
	@Override
	public void setSession(Map session) {
		// TODO Auto-generated method stub
		this.session = session; 
	}  
}

