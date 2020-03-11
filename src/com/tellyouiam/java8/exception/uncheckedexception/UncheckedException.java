package com.tellyouiam.java8.exception.uncheckedexception;

import java.util.Arrays;
import java.util.List;

public class UncheckedException {
	private static void getIndex(int i) throws ArrayIndexOutOfBoundsException {
		if (i == 0) throw new ArrayIndexOutOfBoundsException();
		
	}
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 6, 10, 20);
		integers.forEach(i -> System.out.println(50 / i));
		
		List<Integer> integerList = Arrays.asList(3,9,7,0,10,20);
		integerList.forEach(i -> {
			try {
				System.out.println(20 / i);
			} catch (ArithmeticException e) {
				System.err.println(
						"Arithmetic Exception occurred : " + e.getMessage());
			}
		});
//		integerList.forEach( i -> {
//			if (i == 0) throw new ArithmeticException();
//			getIndex(i);
//		});
	}
}
