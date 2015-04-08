package com.ibuy.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractOrder entity provides the base persistence definition of the Order
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrder implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private Address address;
	private Float totalPrice;
	private Integer orderStatus;
	private Short status;
	private Timestamp createdTime;
	private Timestamp updatedTime;
	private Set orderGoodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOrder() {
	}

	/** minimal constructor */
	public AbstractOrder(User user, Address address, Float totalPrice,
			Integer orderStatus, Short status, Timestamp createdTime,
			Timestamp updatedTime) {
		this.user = user;
		this.address = address;
		this.totalPrice = totalPrice;
		this.orderStatus = orderStatus;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}

	/** full constructor */
	public AbstractOrder(User user, Address address, Float totalPrice,
			Integer orderStatus, Short status, Timestamp createdTime,
			Timestamp updatedTime, Set orderGoodses) {
		this.user = user;
		this.address = address;
		this.totalPrice = totalPrice;
		this.orderStatus = orderStatus;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.orderGoodses = orderGoodses;
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

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Float getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
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

	public Set getOrderGoodses() {
		return this.orderGoodses;
	}

	public void setOrderGoodses(Set orderGoodses) {
		this.orderGoodses = orderGoodses;
	}

}