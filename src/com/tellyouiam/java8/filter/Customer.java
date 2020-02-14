package com.tellyouiam.java8inaction.filter;

/**
 * @author : Ho Anh
 * @since : 20/12/2019, Fri
 **/
public class Customer {
	private String name;
	
	private int points;
	
	public Customer(){}
	
	public Customer(String name, int points) {
		this.name = name;
		this.points = points;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", points=" + points +
				'}';
	}
}
