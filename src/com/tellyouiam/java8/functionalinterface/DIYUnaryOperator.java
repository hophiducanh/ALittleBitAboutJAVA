package com.tellyouiam.java8.functionalinterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DIYUnaryOperator {
	public static void main(String[] args) {
		//https://www.geeksforgeeks.org/function-interface-in-java-with-examples/
		//https://medium.com/@mhmdsalem1993/java-8-composing-functions-using-compose-and-andthen-71ee88816f5
		UnaryOperator<Integer> operator1 = t -> t + 10;
		UnaryOperator<Integer> operator2 = t -> t * 10;
		
		int a = operator1.andThen(operator2).apply(5);
		System.out.println(a);
		
		int b = operator1.compose(operator2).apply(5);
		System.out.println(b);
		
		Function<String, String> upperCase = String::toUpperCase;
		Function<String, String> trim = String::trim;
		//upperCase.compose()
		//upperCase.andThen()
	}
}
