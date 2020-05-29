package com.tellyouiam.clazz;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionHierarchy {
	//https://stackoverflow.com/questions/3854748/why-do-many-collection-classes-in-java-extend-the-abstract-class-and-implement-t
	public static void main(String[] args) {
		for (Class<?> c : ArrayList.class.getInterfaces()) {
			System.out.println(c);
		}
		
		System.out.println(Arrays.toString(ArrayList.class.getAnnotations()));
	}
}
