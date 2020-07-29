package com.tellyouiam.java8.collector.toMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	private static Map<String, String> listToMap(List<Book> books) {
		return books.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
	}
	
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
//		bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
//		bookList.add(new Book("The Two Towers", 1954, "0345339711"));
//		bookList.add(new Book("The Return of the King", 1955, "0618129111"));
		
		//toMap return empty if list to stream is empty
		//System.out.println(listToMap(bookList));
		
		final ArrayList<User> list = new ArrayList<>();
		list.add(new User(1, new Date(System.currentTimeMillis())));
		list.add(new User(1, new Date(System.currentTimeMillis() - 24 * 60 * 60)));
		
		list.add(new User(2, "A", new Date(System.currentTimeMillis())));
		list.add(new User(2, "B", new Date(System.currentTimeMillis() - 24 * 60 * 60)));
		list.add(new User(2, "B", new Date(System.currentTimeMillis() - 2 * 60 * 60)));
		Comparator<User> servedDateComparator = Comparator.comparing(User::getDate);
		
		//for case a mare was served multi time, get the last served date.
		Map<Integer, User> groupByBookingIdMap = list.stream()
				.collect(Collectors.toMap(
						User::getId,
						Function.identity(),
						BinaryOperator.maxBy(servedDateComparator))
				);
		
		System.out.println(new ArrayList<>(groupByBookingIdMap.values()));
	}
}
