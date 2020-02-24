package com.tellyouiam.regex.threadsafe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestThreadSafe {
	private static final String FILE_BEGINNING_PATTERN = "^(,Share %)";
	
	public static void main(String[] args) {
		String str = ",Share %,\"Date Purchased\",Display Name,Address,Phone,Fax,Mobile,Email,";
		
		Matcher beginningFileMatcher = Pattern.compile(FILE_BEGINNING_PATTERN).matcher(str);
		if (beginningFileMatcher.find()) {
			System.out.println("Regex match!");
		}
		
		// find() method starts at the beginning of this matcher's region, or, if
		// a previous invocation of the method was successful and the matcher has
		// not since been reset, at the first character not matched by the previous
		// match.
		//
		
		int count = 0;
		while (beginningFileMatcher.find()) { // find not match, we need beginningFileMatcher.reset() but its not
			// thread-safe.
			count++;
			System.out.println("COUNT ++++++++++++++ :" + count);
		}
		
		//try another way.
		String s = ",Share %,\"Date Purchased\",Display Name,Address,Phone,Fax,Mobile,Email,";
		Pattern beginningFilePattern = Pattern.compile(FILE_BEGINNING_PATTERN);
		Matcher matcher = beginningFilePattern.matcher(s);
		
		if (beginningFilePattern.matcher(s).find()) {
			System.out.println("Thread-safe regex match!.");
		}
		
		int countCount = 0;
		while (beginningFilePattern.matcher(s).find()) { //this cause infinite loop while matcher.find() done as
			// expected result! Why?
			countCount++;
		}
		System.out.println("COUNT ++++++++++++++ :" + countCount);
	}
}
