package com.tellyouiam.hiddenfeature;

import java.util.Scanner;

public class FastReturnStatement {
	private static void sum(int a, int b) { //fast run or Guard Clauses or precondition.
		if (a < 0) return;
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sum(a,b);
	}
}
