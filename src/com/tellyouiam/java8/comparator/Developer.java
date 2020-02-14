package com.tellyouiam.java8.comparator;

import java.math.BigDecimal;

public class Developer {
	private String name;
	private BigDecimal salary;
	private int age;
	private String custom;

	public Developer(){}

	public Developer(String name, BigDecimal salary, int age, String custom) {

		this.name = name;
		this.salary = salary;
		this.age = age;
		this.custom = custom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + " " +salary + "" + age;
	}

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}
}