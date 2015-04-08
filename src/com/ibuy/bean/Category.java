package com.ibuy.bean;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */
public class Category extends AbstractCategory implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(String name, Integer upid, Short status,
			Timestamp createdTime, Timestamp updatedTime) {
		super(name, upid, status, createdTime, updatedTime);
	}

	/** full constructor */
	public Category(String name, Integer upid, Short status,
			Timestamp createdTime, Timestamp updatedTime, Set goodses) {
		super(name, upid, status, createdTime, updatedTime, goodses);
	}

}
