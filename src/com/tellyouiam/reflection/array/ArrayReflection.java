package com.tellyouiam.reflection.array;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://www.geeksforgeeks.org/reflection-array-class-in-java/
public class ArrayReflection {
	public static void main(String[] args) {
		int sizeOfArray = 3;
		int[] intArray = (int[]) Array.newInstance(int.class, sizeOfArray);
	
		Array.setInt(intArray,0, 10);
		Array.setInt(intArray,1, 20);
		Array.setInt(intArray,2, 30);
		System.out.println(Arrays.toString(intArray));
		//:action Run
	}
}
