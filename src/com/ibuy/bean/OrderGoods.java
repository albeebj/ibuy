package com.ibuy.bean;

import java.sql.Timestamp;

/**
 * OrderGoods entity. @author MyEclipse Persistence Tools
 */
public class OrderGoods extends AbstractOrderGoods implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public OrderGoods() {
	}

	/** full constructor */
	public OrderGoods(Goods goods, Order order, Integer amount,
			String goodsSize, String goodsColor, Short status,
			Timestamp createdTime, Timestamp updatedTime) {
		super(goods, order, amount, goodsSize, goodsColor, status, createdTime,
				updatedTime);
	}

}
