package com.tellyouiam.collections.arraylist.modifylist;

import java.util.ArrayList;
import java.util.List;

/**
 * https://stackoverflow.com/questions/20639098/in-java-can-you-modify-a-list-while-iterating-through-it
 * */
public class SetElementWhileIterating {
	public static void main(String[] args) {
		ArrayList<String> letters = new ArrayList<>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		int i = 0;
		
		for (String letter : letters) {
			letters.set(i, "D");
			i++;
		}
		System.out.println("letters = " + letters);
		//modify element while looping through arraylist is ok, its doesn't throw ConcurrenceModificationException
		//because set element doesn't cause Structural Modification.
		// A structural modification is any operation that adds or deletes one or more elements,
		// or explicitly resizes the backing array; merely setting the value of an element is not a structural modification
		
		letters.remove(1);
	}
}
