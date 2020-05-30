package com.tellyouiam.java8.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

import static java.util.stream.Collectors.*;

public class Main {
	public static void singleLevelGrouping(List<Person> persons) {
		final Map<String, List<Person>> personsByCountry = persons.stream().collect(groupingBy(Person::getCountry));
		
		System.out.println("Persons in USA: " + personsByCountry.get("USA"));
	}
	
	public static void twoLevelGrouping(List<Person> personList) {
		final Map<String, Map<String, List<Person>>> personByCountryAndCity
				= personList.stream().collect(groupingBy(Person::getCountry, groupingBy(Person::getCity)));
	}

	public static void threeLevelGrouping(List<Person> persons) {
		Map<String, Map<String, Map<String, List<Person>>>> personByCountryCityAndPetName
				= persons.stream().collect(groupingBy(Person::getCountry, groupByCityAndPetName()));
		
		System.out.println("Persons whose pet is named 'Max' and live in NY: " +
				personByCountryCityAndPetName.get("USA").get("NYC").get("Max").size());
	}
	
	private static Collector<Person, ? , Map<String, Map<String, List<Person>>>> groupByCityAndPetName() {
		return groupingBy(Person::getCity, groupingBy(p -> p.getPet().getName()));
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("John", "USA", "NYC", new Pet("Max", 5));
		Person person2 = new Person("Steve", "UK", "London", new Pet("Lucy", 8));
		Person person3 = new Person("Anna", "USA", "NYC", new Pet("Buddy", 12));
		Person person4 = new Person("Mike", "USA", "Chicago", new Pet("Duke", 10));
		
		List<Person> persons = Arrays.asList(person1, person2, person3, person4);
		System.out.println("*****SINGLE LEVEL*****");
		singleLevelGrouping(persons);
		System.out.println("*****TWO LEVEL*****");
		twoLevelGrouping(persons);
		
		System.out.println("*****THREE LEVEL*****");
		threeLevelGrouping(persons);
		
		int a = 5;
		int b = 3;
		int c = 0;
//		c = a;
//		a = b;
//		b = c;

//		a = a + b;
//		b = a - b;
//		a = a - b;
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a);
		System.out.println(b);
	}
}
