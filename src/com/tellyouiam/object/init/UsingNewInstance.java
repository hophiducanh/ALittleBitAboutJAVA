package com.tellyouiam.object.init;

import com.tellyouiam.object.init.dto.Person;

public class UsingNewInstance {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
			InstantiationException {
		
		// By using new keyword
		
		Person person = new Person();
		person.setName("Naresh");
		System.out.println(person + ", hashcode : " + person.hashCode());
		
		Person person1 = (Person) Class.forName("com.tellyouiam.object.init.dto.Person").newInstance();
		
		person1.setName("Naresh");
		System.out.println(person1 + ", hashcode : " + person1.hashCode());
		System.out.println("".hashCode());
	}
}
