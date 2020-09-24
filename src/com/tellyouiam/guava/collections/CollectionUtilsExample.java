package com.tellyouiam.guava.collections;

import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class CollectionUtilsExample {
	
	@Data
	public static class Customer {
		private Integer id;
		private String name;
		private Address address;
		
		public Customer(Integer id, String name, String locality, String city) {
			this.id = id;
			this.name = name;
			address = new Address(locality, city);
		}
	}
	
	@Data
	public static class Address {
		private String locality;
		private String city;
		
		public Address(String locality, String city) {
			this.locality = locality;
			this.city = city;
		}
	}

	//https://www.baeldung.com/apache-commons-collection-utils
	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Daniel", "locality1", "city1");
		Customer customer2 = new Customer(2, "Fredrik", "locality2", "city2");
		Customer customer3 = new Customer(3, "Kyle", "locality3", "city3");
		Customer customer4 = new Customer(4, "Bob", "locality4", "city4");
		Customer customer5 = new Customer(5, "Cat", "locality5", "city5");
		Customer customer6 = new Customer(6, "John", "locality6", "city6");
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(2,3,4);
		List<Customer> list3 = Arrays.asList(customer1, customer2);
	
		//Merges two sorted Collections, a and b, into a single, sorted List such that the natural ordering of the elements is retained.
		List<Integer> sortedList = CollectionUtils.collate(list1, list2);
		System.out.println(sortedList);
		
		CollectionUtils.filter(list1, i -> (i < 2));
		System.out.println(list1);
		
	}
}
