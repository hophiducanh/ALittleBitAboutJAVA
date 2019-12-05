package com.tellyouiam.string.method;

public class LastIndexOf {
	private static int lastIndexOff() {
		String s1 = "This is the index of the Example";
		return s1.lastIndexOf('s');
	}
	
	private static int lastIndexOff(int ch, int fromIndex) {
		String str = "This is index of example";
		return str.lastIndexOf('s',50); //Whether fromIndex is greater than length or smaller than >> result is same.
	}
	
	public static void main(String[] args) {
		//last index of the string
		System.out.println("LastIndexOf() method: " + lastIndexOff());
		
		//last index from the string by specifying fromIndex
		System.out.println("LastIndexOf(int ch, int fromIndex) method: " + lastIndexOff());
		
		String str = "This is index of example";
		System.out.println(str.lastIndexOf("k"));
		
		/* @return  the index of the last occurrence of the specified substring, or {@code -1} if there is no such occurrence.
		* */
	}
}
