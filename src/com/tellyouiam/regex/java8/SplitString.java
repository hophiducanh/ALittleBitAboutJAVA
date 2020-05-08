package com.tellyouiam.regex.java8;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SplitString {
	//https://stackoverflow.com/questions/6020384/create-array-of-regex-matches
	//lazy iterator
	private static Iterable<MatchResult> allMatches(final Pattern p, final CharSequence input) {
		return () -> new Iterator<MatchResult>() {
			// Use a matcher internally.
			final Matcher matcher = p.matcher(input);
			// Keep a match around that supports any interleaving of hasNext/next calls.
			MatchResult pending;
			
			public boolean hasNext() {
				// Lazily fill pending, and avoid calling find() multiple times if the
				// clients call hasNext() repeatedly before sampling via next().
				if (pending == null && matcher.find()) {
					pending = matcher.toMatchResult();
				}
				return pending != null;
			}
			
			public MatchResult next() {
				// Fill pending if necessary (as when clients call next() without
				// checking hasNext()), throw if not possible.
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				// Consume pending so next call to hasNext() does a find().
				MatchResult next = pending;
				pending = null;
				return next;
			}
		};
	}
	
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
		
		final String sssss = "004-034556-123";
		Matcher matcher = Pattern.compile("-").matcher(sssss);
		int countX = 0;
		while (matcher.find()) {
			countX++;
		}
		System.out.println(countX); //countX = count - 1;
		
		// 		String[] ss = "Hello World(1)".split(Pattern.quote("("));
		//		String[] ss1 = "Hello World(1)".split("\\(");
		
		String input = "Azurite (IRE) ( Azamour (IRE) - High Lite (GB)) 9yo Bay Gelding     Michael Hickmott Bloodstock - In training Michael Hickmott Bloodstock 1/08/2019";
		//String input = "Ambidexter/Elancer 16 ( Ambidexter - Elancer) 3yo Brown Colt     Michael Hickmott Bloodstock - In training Michael Hickmott Bloodstock 24/12/2019       \n";
		
		//if you don't escape special char >> regex interpreted as element in regex instead of normal char in ASCII.
		Pattern nestedParenthesis = Pattern.compile("\\((?:[^)(]+|\\((?:[^)(]+|\\([^)(]*\\))*\\))*\\)");
		List<String> strs = nestedParenthesis.splitAsStream(input).collect(Collectors.toList());
		strs.forEach(System.out::println);
		
		String nestedValue = null;
		
		Matcher nestedParentheses = Pattern.compile("(\\((?:[^)(]+|\\((?:[^)(]+|\\([^)(]*\\))*\\))*\\))").matcher(input);
		if (nestedParentheses.find()) {
			nestedValue = nestedParentheses.group(1);
		}
		System.out.println(nestedValue);
		
		List<String> values = new ArrayList<>();
		List<Integer> leftIndexes = new ArrayList<>();
		List<Integer> rightIndexes = new ArrayList<>();
		
		for (MatchResult match : allMatches(Pattern.compile("(\\((?:[^)(]+|\\((?:[^)(]+|\\([^)(]*\\))*\\))*\\))"), input)) {
			values.add(match.group(1));
			int start = match.start();
			int end = match.end();
			leftIndexes.add(start);
			rightIndexes.add(end);
		}
		
		int startSireDamInfoIndex = Collections.max(leftIndexes);
		int endSireDamInfoIndex = Collections.max(rightIndexes);
		String sireDamPart = StringUtils.substring(input, startSireDamInfoIndex, endSireDamInfoIndex);
		String namePart = StringUtils.substringBeforeLast(input, sireDamPart);
		String additionalInfoIndex = StringUtils.substringAfterLast(input, sireDamPart);
		System.out.println(namePart);
		System.out.println(sireDamPart);
		System.out.println(additionalInfoIndex);
		
		//difference equals and content equals
	}
}
