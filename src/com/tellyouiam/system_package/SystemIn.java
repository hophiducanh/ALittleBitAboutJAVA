package com.tellyouiam.system_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemIn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Printing the file passed in:");
//		while (sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//System.in <--> InputStream
		//System.out <--> PrintStream
		
		int inChar;
		System.out.println("Enter a character:");
		try {
			inChar = System.in.read();
			System.out.println("You entered: ");
			System.out.println(inChar);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("a");
	}
}
