package com.tellyouiam.regex.java8;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SplitString {
	public static void main(String[] args) {
		List<String> stringList = Pattern.compile("-")
				.splitAsStream("004-034556")
				.collect(Collectors.toList());
		
		// If the input sequence is mutable, it must remain constant during the
		// execution of the terminal stream operation.  Otherwise, the result of the
		// terminal stream operation is undefined.
		long count = Pattern.compile("-")
				.splitAsStream("004-034556-123")
				.count(); //count: count how many element in stream.
		System.out.println("COUNT********: " + count);
		
		//stringList.forEach(System.out::println);
		
		final String s = "004-034556-123";
		Matcher matcher = Pattern.compile("-").matcher(s);
		int countX = 0;
		while (matcher.find()) {
			countX++;
		}
		System.out.println(countX); //countX = count - 1;
		
		String input = "Azurite (IRE) ( Azamour (IRE) - High Lite (GB)) 9yo Bay Gelding     Michael Hickmott " +
				"Bloodstock - In training Michael Hickmott Bloodstock 1/08/2019";
		
		List<String> strs = Pattern.compile("([^,].+)").splitAsStream(input).collect(Collectors.toList());
		strs.forEach(System.out::println);
		String[] ss = "Hello World(1)".split(Pattern.quote("("));
		String[] ss1 = "Hello World(1)".split("\\(");
		
	}
}
