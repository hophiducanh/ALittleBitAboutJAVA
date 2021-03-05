package com.tellyouiam.scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.util.Scanner;

public class SkipNewLine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//https://archie94.github.io/blogs/skip-newline-while-reading-from-scanner-class
		//https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
//		scanner.nextLine();
		
		while(n-- > 0) {
			String s = scanner.nextLine();
			System.out.println(s);
		}
	}
}
