package com.ibuy.bean;

import java.sql.Timestamp;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username, String password, String email, Short status,
			Timestamp createdTime, Timestamp updatedTime) {
		super(username, password, email, status, createdTime, updatedTime);
	}

	/** full constructor */
	public User(String username, String password, String phoneNum,
			String email, Short status, Timestamp createdTime,
			Timestamp updatedTime, Set addresses, Set carts, Set orders) {
		super(username, password, phoneNum, email, status, createdTime,
				updatedTime, addresses, carts, orders);
	}

}
