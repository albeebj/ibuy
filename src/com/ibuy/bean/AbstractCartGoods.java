package com.ibuy.bean;

import java.sql.Timestamp;

/**
 * AbstractCartGoods entity provides the base persistence definition of the
 * CartGoods entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCartGoods implements java.io.Serializable {

	// Fields

	private Integer id;
	private Goods goods;
	private Cart cart;
	private Integer amount;
	private Short status;
	private Timestamp createdTime;
	private Timestamp updatedTime;

	// Constructors

	/** default constructor */
	public AbstractCartGoods() {
	}

	/** full constructor */
	public AbstractCartGoods(Goods goods, Cart cart, Integer amount,
			Short status, Timestamp createdTime, Timestamp updatedTime) {
		this.goods = goods;
		this.cart = cart;
		this.amount = amount;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Cart getCart() {
		return this.cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
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

}