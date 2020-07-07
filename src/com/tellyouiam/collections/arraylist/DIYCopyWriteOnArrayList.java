package com.tellyouiam.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DIYCopyWriteOnArrayList {
	//TODO: http://java-latte.blogspot.com/2014/06/How-CopyOnWriteArrayList-works-in-Java-how-it-differ-from-ArrayList.html
	public static void main(String[] args) {
		// Disable this to avoid ConcurrentModificationException
		List<String> companies = new ArrayList<>();
		
		// Enable this to avoid ConcurrentModificationException
		// List<String> companies = new CopyOnWriteArrayList<>();
		
		companies.add("Google");
		companies.add("Yahoo");
		companies.add("Facebook");
		companies.add("eBay");
		companies.add("Microsoft");
		
		// Get an iterator over a collection. Iterator takes the place of
		// Enumeration in the Java Collections Framework.
		Iterator<String> crunchifyIterator = companies.iterator();
		
		// Make changes to companies List while performing hasNext()
		while (crunchifyIterator.hasNext()) {
			
			System.out.println("companies list: " + companies);
			
			//if modeCount > companies.size() >> throw ConcurrentModificationException
			//https://stackoverflow.com/questions/58200927/how-fail-fast-iterator-works-internally?noredirect=1&lq=1
			//https://crunchify.com/copyonwritearraylist-vs-arraylist-in-java-comparison-and-example/
			//https://stackoverflow.com/questions/1668901/java-modcount-arraylist
			String crunchifyString = crunchifyIterator.next();
			
			// Test1: Below statement causes ConcurrentModificationException
			System.out.println(crunchifyString);
			if (crunchifyString.equals("Yahoo"))
				// modCount = 6
				companies.remove("Microsoft");
			if (crunchifyString.equals("eBay"))
				companies.add("My Message Goes here... eBay present");
			
			// Test2: Below change wont throw ConcurrentModificationException
			// Reason: It doesn't change modCount variable of "companies"
			if (crunchifyString.equals("Google"))
				companies.set(2, "Google");
			
		}
	}
}
