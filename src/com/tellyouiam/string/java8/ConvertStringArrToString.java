package com.tellyouiam.string.java8;

import com.google.common.base.Joiner;

public class ConvertStringArrToString {
	public static void main(String[] args) {
		String[] arr = new String[] {"L","O","G","B","A","S","E","X"};
		String s = String.join("", arr);
		System.out.println(s);
		
		//guava
		String str = Joiner.on(", ").skipNulls().join("Harry", null, "Ron", "Hermione");
		System.out.println(str);
		
	}
}
