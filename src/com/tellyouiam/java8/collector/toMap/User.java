package com.tellyouiam.java8.collector.toMap;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private Date date;
	
	public User() {}
	
	public User(Integer id, Date date) {
		this.id = id;
		this.date = date;
	}
	
	public User(Integer id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}
