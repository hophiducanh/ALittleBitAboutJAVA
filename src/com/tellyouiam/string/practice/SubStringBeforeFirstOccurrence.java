package com.tellyouiam.string.practice;

public class SubStringBeforeFirstOccurrence {
	public static void main(String[] args) {
		String str = "Daniel Joe\nLogbasex\ragfas";
		
		int headerIndex = str.indexOf("\n");
		if (headerIndex != -1) {
			System.out.println(str.substring(0, headerIndex));
		}
	}
}
