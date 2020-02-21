package com.tellyouiam.java8.string;

import java.util.StringJoiner;

public class StringJoinerMerge {
	//We can merge two joiners using merge(). It adds the contents of the given StringJoiner without prefix and suffix as the next element:
	public static void main(String[] args) {
		String SUFFIX = "]";
		String PREFIX = "[";
		StringJoiner rgbJoiner = new StringJoiner(",", PREFIX, SUFFIX);
		StringJoiner cmybJoiner = new StringJoiner("-", PREFIX, SUFFIX);
		rgbJoiner.add("Red")
				.add("Green")
				.add("Blue");
		cmybJoiner.add("Cyan")
				.add("Magenta")
				.add("Yellow")
				.add("Black");
		
		rgbJoiner.merge(cmybJoiner);
		//[Red,Green,Blue,Cyan-Magenta-Yellow-Black]
		System.out.println(rgbJoiner.toString());
	}
}
