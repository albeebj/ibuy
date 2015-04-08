package com.ibuy.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCategory entity provides the base persistence definition of the
 * Category entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCategory implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer upid;
	private Short status;
	private Timestamp createdTime;
	private Timestamp updatedTime;
	private Set goodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCategory() {
	}

	/** minimal constructor */
	public AbstractCategory(String name, Integer upid, Short status,
			Timestamp createdTime, Timestamp updatedTime) {
		this.name = name;
		this.upid = upid;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}

	/** full constructor */
	public AbstractCategory(String name, Integer upid, Short status,
			Timestamp createdTime, Timestamp updatedTime, Set goodses) {
		this.name = name;
		this.upid = upid;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.goodses = goodses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUpid() {
		return this.upid;
	}

	public void setUpid(Integer upid) {
		this.upid = upid;
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

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

}