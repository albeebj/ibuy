package com.ibuy.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAddress entity provides the base persistence definition of the
 * Address entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAddress implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String description;
	private String postcode;
	private String pohoneNum;
	private Short status;
	private Timestamp createdTime;
	private Timestamp updatedTime;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAddress() {
	}

	/** minimal constructor */
	public AbstractAddress(User user, String description, String postcode,
			String pohoneNum, Short status, Timestamp createdTime,
			Timestamp updatedTime) {
		this.user = user;
		this.description = description;
		this.postcode = postcode;
		this.pohoneNum = pohoneNum;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}

	/** full constructor */
	public AbstractAddress(User user, String description, String postcode,
			String pohoneNum, Short status, Timestamp createdTime,
			Timestamp updatedTime, Set orders) {
		this.user = user;
		this.description = description;
		this.postcode = postcode;
		this.pohoneNum = pohoneNum;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.orders = orders;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPohoneNum() {
		return this.pohoneNum;
	}

	public void setPohoneNum(String pohoneNum) {
		this.pohoneNum = pohoneNum;
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

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}