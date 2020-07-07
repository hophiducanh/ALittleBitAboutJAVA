package com.tellyouiam.java8.comparator;

import java.text.Collator;
import java.util.Locale;

/**
 * @author : Ho Anh
 * @since : 15/12/2019, Sun
 **/
public class CompareString {
	private static int compare(String obj1, String obj2) {
		if (obj1 == null) {
			return -1;
		}
		if (obj2 == null) {
			return 1;
		}
		if (obj1.equals(obj2)) {
			return 0;
		}
		
		Collator usCollator = Collator.getInstance(Locale.US);
		usCollator.setStrength(Collator.PRIMARY);
		return usCollator.compare(obj1, obj2);
	}
	
	public static void main(String[] args) {
		Collator collator = Collator.getInstance();
		System.out.println(compare("Anh", "anh"));
	}
}











