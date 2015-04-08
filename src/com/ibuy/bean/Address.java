package com.ibuy.bean;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */
public class Address extends AbstractAddress implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** minimal constructor */
	public Address(User user, String description, String postcode,
			String pohoneNum, Short status, Timestamp createdTime,
			Timestamp updatedTime) {
		super(user, description, postcode, pohoneNum, status, createdTime,
				updatedTime);
	}

	/** full constructor */
	public Address(User user, String description, String postcode,
			String pohoneNum, Short status, Timestamp createdTime,
			Timestamp updatedTime, Set orders) {
		super(user, description, postcode, pohoneNum, status, createdTime,
				updatedTime, orders);
	}

}
