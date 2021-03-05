package com.tellyouiam.string.compare;

public class EqualIgnore {
	public static void main(String[] args) {
		if ("logbasex".toLowerCase().equalsIgnoreCase("Logbasex")) {
//			System.out.println("true");
		}
		
		
		for (int i = 5; i > 0; i--) {
			System.out.println();
			for (int j = 1; j < 5; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
		}
	}
}
