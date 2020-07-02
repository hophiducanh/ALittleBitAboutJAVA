package com.tellyouiam.loops;

public class SpecialSyntax {
	//https://stackoverflow.com/questions/7081339/how-does-a-for-loop-work-specifically-for
	public static void main(String[] args) {
		//similar to while (true) {} statement >> infinite loop.
		int i = 0;
		for (;;) {
			i++;
			System.out.println(i);
		}
	}
}
