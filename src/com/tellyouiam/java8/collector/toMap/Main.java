package com.tellyouiam.java8.collector.toMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
		System.out.println(listToMap(bookList));
	}
}
