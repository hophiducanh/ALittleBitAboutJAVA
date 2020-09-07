package com.tellyouiam.object.init;

import com.tellyouiam.object.init.dto.Person;

public class UsingNaiveMethod {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge("15");
		person.setName("Logbasex");
		System.out.println(person);
	}
}
