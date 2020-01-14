package com.tellyouiam.string.practice;

import java.util.UUID;

public class UniqueStringGeneration {
	
	public static void main(String[] args) {
		String name = UUID.randomUUID().toString().replace("-", "");
		System.out.println(name);
		System.out.println(name.length());
	}
}
