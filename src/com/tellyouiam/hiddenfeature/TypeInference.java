package com.tellyouiam.hiddenfeature;

import java.util.Collections;
import java.util.List;

/**
 *@link https://docs.oracle.com/javase/tutorial/java/generics/genTypeInference.html
 * */
public class TypeInference {
	
	private static void processStringList(List<String> stringList) {
		// process stringList
	}
	
	public static void main(String[] args) {
		List<String> firstList = Collections.<String>emptyList();
		
		List<String> secondList = Collections.emptyList();
		
		processStringList(firstList);
		
		/*
		* The compiler requires a value for the type argument T so it starts with the value Object.
		* Consequently, the invocation of Collections.emptyList returns a value of type List<Object>,
		* which is incompatible with the method processStringList.
		* Thus, in Java SE 7, you must specify the value of the value of the type argument as follows:
		* */
		processStringList(secondList); //In JavaSE 7 >> this does not compiled.
	}
}
