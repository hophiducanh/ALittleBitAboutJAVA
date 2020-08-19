package com.tellyouiam.collections.tuples;

import org.javatuples.Quartet;

//https://www.baeldung.com/java-tuples
//https://www.geeksforgeeks.org/implement-quartet-class-with-triplet-class-in-java-using-java-tuples/?ref=rp
public class QuartetEx {
	public static void main(String[] args) {
		Quartet<String, Double, Integer, String> quartet
				= Quartet.with("john", 72.5, 32, "1051 SW");
		
		String name = quartet.getValue0();
		Integer age = quartet.getValue2();
		System.out.println(name + age);
	}
}
