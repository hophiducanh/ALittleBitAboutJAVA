package com.tellyouiam.java8.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class Main {
	public static void singleLevelGrouping(List<Person> persons) {
		final Map<String, List<Person>> personsByCountry = persons.stream().collect(groupingBy(Person::getCountry));
		
		System.out.println("Persons in USA: " + personsByCountry.get("USA"));
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("John", "USA", "NYC", new Pet("Max", 5));
		Person person2 = new Person("Steve", "UK", "London", new Pet("Lucy", 8));
		Person person3 = new Person("Anna", "USA", "NYC", new Pet("Buddy", 12));
		Person person4 = new Person("Mike", "USA", "Chicago", new Pet("Duke", 10));
		
		List<Person> persons = Arrays.asList(person1, person2, person3, person4);
		singleLevelGrouping(persons);
	}
}
