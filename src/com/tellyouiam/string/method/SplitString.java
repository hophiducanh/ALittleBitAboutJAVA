package com.tellyouiam.string.method;

import java.util.Arrays;
import java.util.List;

public class SplitString {
	public static void main(String[] args) {
		String ids = "123,456";
		List<String> id = Arrays.asList(ids.split(","));
		System.out.println(id.size());
		List<String> id1 = Arrays.asList(",".split(ids)); // >> wrong
		System.out.println(Arrays.toString(new List[]{id}));
		id.forEach(System.out::println);
		
		StringBuilder builder = new StringBuilder(String.format("%s,%s", "cc", "ngu"));
		String ownerData =  String.format("%s,%s", "hello", "haha");
		builder.append(String.format("%s\n", ownerData));
		System.out.println(builder);
	}
}
