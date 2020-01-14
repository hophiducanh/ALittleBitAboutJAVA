package com.tellyouiam.collections.arraylist;

import java.util.Collections;
import java.util.Set;

public class EmptyList {
	public static void main(String[] args) {
		Set<String> setOwnerEmail = Collections.emptySet();
		System.out.println("Size: " + setOwnerEmail.size());
		if (setOwnerEmail.isEmpty()) {
			System.out.println("haha");
		}
	}
}
