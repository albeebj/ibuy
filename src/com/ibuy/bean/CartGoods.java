package com.ibuy.bean;

import java.sql.Timestamp;

/**
 * CartGoods entity. @author MyEclipse Persistence Tools
 */
public class CartGoods extends AbstractCartGoods implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CartGoods() {
	}

	/** full constructor */
	public CartGoods(Goods goods, Cart cart, Integer amount, Short status,
			Timestamp createdTime, Timestamp updatedTime) {
		super(goods, cart, amount, status, createdTime, updatedTime);
	}

}
