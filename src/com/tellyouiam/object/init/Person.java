package com.tellyouiam.object.init;

import com.google.common.base.MoreObjects;

public class Person {
	private String name;
	private String age;

	
	//@link com.tellyouiam.object.init.NaiveMethod
	
	public Person() {
	
	}
	
	//@link com.tellyouiam.object.init.UsingConstructor
	public Person(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	//@link com.tellyouiam.object.init.UsingCopyConstructor
	public Person(Person person) {
		this(person.name, person.age);
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("name", name)
				.add("age", age)
				.toString();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
}
