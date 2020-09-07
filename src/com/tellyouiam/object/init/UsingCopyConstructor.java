package com.tellyouiam.object.init;

import com.tellyouiam.object.init.dto.Person;

public class UsingCopyConstructor {
	public static void main(String[] args) {
		//The new keyword is responsible for allocating memory for the new object through a constructor.
		Person person = new Person("Logbasex", "22");
		Person newPerson = new Person(person);
		System.out.println(newPerson);
	}
}
