package com.tellyouiam.variable.scope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfVariableRetainValueInMethodScope {
	private static void alter(String name) {
		name = "lala";
	}
	
	private static void add(List<String> x) {
		x.addAll(Arrays.asList("a", "b"));
	}
	
	public static void main(String[] args) {
		String name = "Logbasex";
		List<String> x = new ArrayList<>();
		
		alter(name);
		System.out.println(name);//logbasex
		
		add(x);
		System.out.println(x.size()); //2
	}
}
