package com.tellyouiam.collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAndArrayListReferenceType {
	public static void main(String[] args) {
		//Difference between:
		ArrayList al = new ArrayList();
		
		//And
		List la = new ArrayList();
		
		/*
		* The difference is that, in you second example, al allows access to all methods implemented on the List interface while,
		* in the first example, al allows access to all (accessible) methods and fields of the ArrayList class.
		*
		* The advantage to using List is that you can change the underlying object to be a different kind of list without breaking your contract with any code that's using it.
		* If you declare it as ArrayList, you have to change your contract if you want to change the underlying implementation.
		* https://stackoverflow.com/questions/4592558/oop-difference-between-arraylist-al-new-arraylist-and-list-al-new-arrayli
		* */
		//al = new LinkedList<>(); >> false
		la = new LinkedList(); // >> OK
		
	}
}
