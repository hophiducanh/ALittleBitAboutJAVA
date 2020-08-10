package com.tellyouiam.object.tostring;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ToString {
	static class User {
		private int id;
		private String name;
		
		public User(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public String toString() {
			return ToStringBuilder.reflectionToString(this);
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new ToString.User(1, "Ha").toString());
	}
}
