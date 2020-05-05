package com.tellyouiam.variable.scope;

public class CheckIfVariableRetainValueInMethodScope {
	private static void alter(String name) {
		name = "lala";
	}
	
	public static void main(String[] args) {
		String name = "Logbasex";
		
		alter(name);
		System.out.println(name);//logbasex
	}
}
