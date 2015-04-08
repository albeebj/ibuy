package com.ibuy.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String phoneNum;
	private String email;
	private Short status;
	private Timestamp createdTime;
	private Timestamp updatedTime;
	private Set addresses = new HashSet(0);
	private Set carts = new HashSet(0);
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** minimal constructor */
	public AbstractUser(String username, String password, String email,
			Short status, Timestamp createdTime, Timestamp updatedTime) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}

	/** full constructor */
	public AbstractUser(String username, String password, String phoneNum,
			String email, Short status, Timestamp createdTime,
			Timestamp updatedTime, Set addresses, Set carts, Set orders) {
		this.username = username;
		this.password = password;
		this.phoneNum = phoneNum;
		this.email = email;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.addresses = addresses;
		this.carts = carts;
		this.orders = orders;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Set getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set addresses) {
		this.addresses = addresses;
	}

	public Set getCarts() {
		return this.carts;
	}

	public void setCarts(Set carts) {
		this.carts = carts;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}