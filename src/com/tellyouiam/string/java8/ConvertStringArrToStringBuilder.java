package com.tellyouiam.string.java8;

public class ConvertStringArrToStringBuilder {
	public static void main(String[] args) {
		String[] arr = new String[] {"L","O","G","B","A","S","E","X"};
		StringBuilder builder = new StringBuilder(String.join("", arr));
		System.out.println(builder.append("\n"));
	}
}
