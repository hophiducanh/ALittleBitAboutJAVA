package com.tellyouiam.lombok.dto;

import lombok.Data;
import lombok.Setter;

@Setter
@Data
public class User {
	private String firstName;
	private String lastName;
	private Integer age;
	
	User(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public static UserBuilder builder() {
		return new UserBuilder();
	}
	
	public String toString() {
		return "User(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", age=" + this.getAge() + ")";
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public static class UserBuilder {
		private String firstName;
		private String lastName;
		private Integer age;
		
		UserBuilder() {
		}
		
		public UserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public UserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public UserBuilder age(Integer age) {
			this.age = age;
			return this;
		}
		
		public User build() {
			return new User(firstName, lastName, age);
		}
		
		public String toString() {
			return "User.UserBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", age=" + this.age + ")";
		}
	}
}
