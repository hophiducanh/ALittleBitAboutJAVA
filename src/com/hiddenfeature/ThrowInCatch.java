package com.hiddenfeature;

public class ThrowInCatch {
	
	static private void foo() throws Exception {
		try {
			int i = Integer.parseInt("ten");
		} catch (NumberFormatException e) {
			throw new Exception();
		}
	}
	public static void main(String[] args) {
	
	}
}
