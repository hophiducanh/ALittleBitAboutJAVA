package com.tellyouiam.java8inaction.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Ho Anh
 * @since : 20/12/2019, Fri
 **/
public class FilterWithReturnStatement {
	public static void main(String[] args) {
		Customer john = new Customer("John P.", 15);
		Customer sarah = new Customer("Sarah M.", 200);
		Customer charles = new Customer("Charles B.", 150);
		Customer mary = new Customer("Mary T.", 1);

		List<Customer> customers = Arrays.asList(john, sarah, charles, mary);
		List<String> text = Arrays.asList("John P.", "Sarah M.");
		
		//Get element has return true >> match conditions
		List<Customer> customersList = customers
				.stream()
				.filter(c ->{
					String name = c.getName();
					return text.contains(name);
				})
				.collect(Collectors.toList());
		
		customersList.stream().map(Customer::toString).forEach(System.out::println);
	}
}
