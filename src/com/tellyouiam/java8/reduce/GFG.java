package com.tellyouiam.java8.reduce;

import java.util.Arrays;
import java.util.List;

public class GFG {
	/**
	 * T reduce(T identity, BinaryOperator<T> accumulator);
	 *
	 * Where, identity is INITIAL VALUE of type T
	 * and
	 * accumulator is a function for combining two values.
	 * */
	
	// sum(), min(), max(), count() etc. are some examples of reduce operations. reduce() explicitly asks you to
	// specify how to reduce the data that made it through the stream.
	public static void main(String[] args)
	{
		
		// Creating list of integers
		List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
		
		// Finding sum of all elements
		int sum = array.stream().reduce(0, Integer::sum);
		
		// Displaying sum of all elements
		System.out.println("The sum of all elements is " + sum);
	}
}
