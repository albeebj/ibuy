package com.ibuy.bean;

import java.util.Set;

/**
 * Cart entity. @author MyEclipse Persistence Tools
 */
public class Cart extends AbstractCart implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Cart() {
	}

	/** minimal constructor */
	public Cart(User user, Integer totalPrice) {
		super(user, totalPrice);
	}

	/** full constructor */
	public Cart(User user, Integer totalPrice, Set cartGoodses) {
		super(user, totalPrice, cartGoodses);
	}

}
