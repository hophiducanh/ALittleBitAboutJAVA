package com.testing.junit5.bean;

public class NumbersBean {
	/**
	 * Returns true if a number is even, false otherwise.
	 *
	 * @param number
	 *            the number to check
	 * @return true if the argument is even, false otherwise
	 */
	public boolean isNumberEven(int number) {
		return number % 2 == 0;
	}
}
