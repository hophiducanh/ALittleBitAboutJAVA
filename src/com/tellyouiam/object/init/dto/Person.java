package com.tellyouiam.object.init.dto;

import com.google.common.base.MoreObjects;

import java.util.Objects;

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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return Objects.equals(name, person.name) &&
				Objects.equals(age, person.age);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
}
