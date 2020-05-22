package com.tellyouiam.clazz;

public class ForNameMethod {
	public static void main(String[] args) {
		try {
			String str = Class.forName("java.lang.String").getName();
			Class.forName("java.lang.String");
			System.out.println(str);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
