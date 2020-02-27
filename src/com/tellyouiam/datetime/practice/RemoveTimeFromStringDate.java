package com.tellyouiam.datetime.practice;

public class RemoveTimeFromStringDate {
	public static void main(String[] args) {
		String dateStr = "15/08/2013 15:30";
		String result = dateStr.split("\\p{Z}")[0];
		System.out.println(result);
		
		String str = "15/08/2013";
		String r = str.split("\\p{Z}")[0];
		System.out.println(r);
	}
}
