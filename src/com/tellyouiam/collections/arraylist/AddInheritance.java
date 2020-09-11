package com.tellyouiam.collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddInheritance {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new Stud(1, "A", "B"));
		User user1 = new Stud(1, "A", "B");
		users.add(user1);
		final List<String> list = users.stream().map(User::getName).collect(Collectors.toList());
		list.forEach(System.out::println);
		
		final List<Stud> studs = new ArrayList<>();
//		studs.add(new User(1, "A"));  //compile error
	}
	
	static class User {
		private Integer id;
		private String name;
		
		public User(Integer id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public Integer getId() {
			return id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}
	
	static class Stud extends User {
		private String code;
		
		public Stud(Integer id, String name, String code) {
			super(id, name);
			this.code = code;
		}
		
		public Stud(Integer id, String name) {
			super(id, name);
		}
		
		public String getCode() {
			return code;
		}
		
		public void setCode(String code) {
			this.code = code;
		}
	}
}
