package com.tellyouiam.decision.making;

import java.util.Scanner;

public class EsleIfAndIfInElse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		if (i > 5) {
			System.out.println(i);
		} else {
			if (i == 3) {
				System.out.println(i); // i = 2 stills working.
			}
			System.out.println(i);
		}
		
		if (i > 5) {
			System.out.println(i + 1);
		} else if (i == 3) { //i = 2 not doing anything.
			System.out.println(i);
		}
	}
}
