package com.ibuy.bean;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */
public class Goods extends AbstractGoods implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** minimal constructor */
	public Goods(Category category, String name, Integer price,
			Integer storage, Short status, Timestamp createdTime,
			Timestamp updatedTime) {
		super(category, name, price, storage, status, createdTime, updatedTime);
	}

	/** full constructor */
	public Goods(Category category, String name, Integer price,
			Integer storage, String description, String imgAddress,
			Short status, Timestamp createdTime, Timestamp updatedTime,
			Set cartGoodses, Set orderGoodses) {
		super(category, name, price, storage, description, imgAddress, status,
				createdTime, updatedTime, cartGoodses, orderGoodses);
	}

}
