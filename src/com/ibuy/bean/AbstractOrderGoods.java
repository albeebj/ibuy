package com.ibuy.bean;

import java.sql.Timestamp;

/**
 * AbstractOrderGoods entity provides the base persistence definition of the
 * OrderGoods entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrderGoods implements java.io.Serializable {

	// Fields

	private Integer id;
	private Goods goods;
	private Order order;
	private Integer amount;
	private String goodsSize;
	private String goodsColor;
	private Short status;
	private Timestamp createdTime;
	private Timestamp updatedTime;

	// Constructors

	/** default constructor */
	public AbstractOrderGoods() {
	}

	/** full constructor */
	public AbstractOrderGoods(Goods goods, Order order, Integer amount,
			String goodsSize, String goodsColor, Short status,
			Timestamp createdTime, Timestamp updatedTime) {
		this.goods = goods;
		this.order = order;
		this.amount = amount;
		this.goodsSize = goodsSize;
		this.goodsColor = goodsColor;
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

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getGoodsSize() {
		return this.goodsSize;
	}

	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}

	public String getGoodsColor() {
		return this.goodsColor;
	}

	public void setGoodsColor(String goodsColor) {
		this.goodsColor = goodsColor;
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