package com.tellyouiam.loops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* https://stackoverflow.com/questions/85190/how-does-the-java-for-each-loop-work
* https://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-14.14.2 (JLS: Java Language Specification)
* */
public class HowForEachLoopWork {
	public static void main(String[] args) {
		List<String> someList = new ArrayList<String>();
		someList.add("Apple");
		someList.add("Ball");
		for (String item : someList) {
			System.out.println(item);
		}

// IS TRANSLATED TO:
		System.out.println("*****************************************************");
		
		for(Iterator<String> stringIterator = someList.iterator(); stringIterator.hasNext(); ) {
			String item = stringIterator.next();
			System.out.println(item);
		}
	}
}
