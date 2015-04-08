package com.ibuy.bean;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */
public class Order extends AbstractOrder implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(User user, Address address, Float totalPrice,
			Integer orderStatus, Short status, Timestamp createdTime,
			Timestamp updatedTime) {
		super(user, address, totalPrice, orderStatus, status, createdTime,
				updatedTime);
	}

	/** full constructor */
	public Order(User user, Address address, Float totalPrice,
			Integer orderStatus, Short status, Timestamp createdTime,
			Timestamp updatedTime, Set orderGoodses) {
		super(user, address, totalPrice, orderStatus, status, createdTime,
				updatedTime, orderGoodses);
	}

}
