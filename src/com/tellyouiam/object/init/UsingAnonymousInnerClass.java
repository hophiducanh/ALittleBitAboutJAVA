package com.tellyouiam.object.init;

public class UsingAnonymousInnerClass {
	public static void main(String[] args) {
		Person person = new Person() {{
			setName("Logbasex");
			setAge("22");
		}};
		System.out.println(person);
	}
}
