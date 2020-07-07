package com.tellyouiam.collections.arraylist.modifylist;

import java.util.ArrayList;
import java.util.List;

/**
 * https://stackoverflow.com/questions/1196586/calling-remove-in-foreach-loop-in-java
 * https://stackoverflow.com/questions/223918/iterating-through-a-collection-avoiding-concurrentmodificationexception-when-re
 * https://stackoverflow.com/questions/1196586/calling-remove-in-foreach-loop-in-java
 *  */
public class RemoveElementWhileIterating {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("");
		
//		for(Iterator<String> iterator = arrayList.iterator(); iterator.hasNext();) {
//			String string = iterator.next();
//			if (string.isEmpty()) {
//				iterator.remove();
//			}
//		}
		//System.out.println("arrayList = " + arrayList); : soutv
		
		//is as same as:
		//arrayList.removeIf(String::isEmpty);
		System.out.println("arrayList = " + arrayList);
		
		//trick: remove backward doesn't cause structural modification (structural modification caused concurrent modification exception)
//		for (int i = arrayList.size() - 1; i >= 0 ; i--) {
//			if (arrayList.get(i).isEmpty()) {
//				arrayList.remove(i);
//			}
//		}
//		System.out.println(arrayList);
	
	//loop through new ArrayList and remove in current arrayList is fine but this way isn't recommended because this wasting resources.
		for (String s : new ArrayList<>(arrayList)) {
			if (s.isEmpty()) {
				arrayList.remove(s);
			}
		}
		System.out.println("arrayList = " + arrayList);
	}
}
