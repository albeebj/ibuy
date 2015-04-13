package com.ibuy.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractGoods entity provides the base persistence definition of the Goods
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGoods implements java.io.Serializable {

	// Fields

	private Integer id;
	private Category category;
	private String name;
	private Integer price;
	private Integer storage;
	private String description;
	private String imgAddress;
	private Integer soldAmount;
	private Short isRecommand;
	private Short gender;
	private Short status;
	private Timestamp createdTime;
	private Timestamp updatedTime;
	private Set cartGoodses = new HashSet(0);
	private Set orderGoodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractGoods() {
	}

	/** minimal constructor */
	public AbstractGoods(Category category, String name, Integer price,
			Integer storage, Integer soldAmount, Short isRecommand,
			Short gender, Short status, Timestamp createdTime,
			Timestamp updatedTime) {
		this.category = category;
		this.name = name;
		this.price = price;
		this.storage = storage;
		this.soldAmount = soldAmount;
		this.isRecommand = isRecommand;
		this.gender = gender;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}

	/** full constructor */
	public AbstractGoods(Category category, String name, Integer price,
			Integer storage, String description, String imgAddress,
			Integer soldAmount, Short isRecommand, Short gender, Short status,
			Timestamp createdTime, Timestamp updatedTime, Set cartGoodses,
			Set orderGoodses) {
		this.category = category;
		this.name = name;
		this.price = price;
		this.storage = storage;
		this.description = description;
		this.imgAddress = imgAddress;
		this.soldAmount = soldAmount;
		this.isRecommand = isRecommand;
		this.gender = gender;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.cartGoodses = cartGoodses;
		this.orderGoodses = orderGoodses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getStorage() {
		return this.storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgAddress() {
		return this.imgAddress;
	}

	public void setImgAddress(String imgAddress) {
		this.imgAddress = imgAddress;
	}

	public Integer getSoldAmount() {
		return this.soldAmount;
	}

	public void setSoldAmount(Integer soldAmount) {
		this.soldAmount = soldAmount;
	}

	public Short getIsRecommand() {
		return this.isRecommand;
	}

	public void setIsRecommand(Short isRecommand) {
		this.isRecommand = isRecommand;
	}

	public Short getGender() {
		return this.gender;
	}

	public void setGender(Short gender) {
		this.gender = gender;
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

	public Set getCartGoodses() {
		return this.cartGoodses;
	}

	public void setCartGoodses(Set cartGoodses) {
		this.cartGoodses = cartGoodses;
	}

	public Set getOrderGoodses() {
		return this.orderGoodses;
	}

	public void setOrderGoodses(Set orderGoodses) {
		this.orderGoodses = orderGoodses;
	}

}