package com.tellyouiam.collections.vector;

import java.util.*;

/**
 * https://www.baeldung.com/java-arraylist-vs-vector
 * https://javapapers.com/core-java/java-collection/difference-between-vector-and-arraylist-in-java/
 * Vector has been around Java 1.0, ArrayList in Java 1.2
 * */
public class VectorAndArrayList {
	public static void main(String[] args) {
		//creating an arraylist
		ArrayList<String> al = new ArrayList<>();
		al.add("Practice.GeeksforGeeks.org");
		al.add("quiz.GeeksforGeeks.org");
		al.add("code.GeeksforGeeks.org");
		al.add("contribute.GeeksforGeeks.org");
		
		//traversing element using Iterator
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		Vector<String> v = new Vector<>();
		v.addElement("Practice");
		v.addElement("quiz");
		v.addElement("code");
		
		// traversing elements using Enumeration
		System.out.println("\nVector elements are:");
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//Alternative for synchronized collection (alternative for Vector)
		List<String> list = Collections.synchronizedList(new ArrayList<>());
	}
}
