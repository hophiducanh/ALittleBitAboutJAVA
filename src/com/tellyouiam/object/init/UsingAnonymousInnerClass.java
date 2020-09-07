package com.tellyouiam.object.init;

import com.tellyouiam.object.init.dto.Person;

public class UsingAnonymousInnerClass {
	public static void main(String[] args) {
		Person person = new Person() {{
			setName("Logbasex");
			setAge("22");
		}};
		System.out.println(person);
	}
}
