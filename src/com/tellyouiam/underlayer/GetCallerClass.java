package com.tellyouiam.underlayer;

import java.util.Arrays;

public class GetCallerClass {
	private static String getName () {
		String className = Thread.currentThread().getStackTrace()[2].getMethodName();
		StackTraceElement[] stackTraceElements  = Thread.currentThread().getStackTrace();
		Arrays.asList(stackTraceElements).forEach(i -> System.out.println(i.getMethodName()));
		return "logbasex";
	}
	
	public static void main(String[] args) {
		System.out.println(getName());
	}
}
