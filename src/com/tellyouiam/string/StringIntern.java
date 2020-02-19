package com.tellyouiam.string;

public class StringIntern {
	public static void main(String[] args) { //https://stackoverflow.com/questions/10578984/what-is-java-string-interning?noredirect=1&lq=1
		String s1 = "Rakesh";
		String s2 = "Rakesh";
		String s3 = "Rakesh".intern();
		String s4 = new String("Rakesh");
		String s5 = new String("Rakesh").intern();
		
		String str = new String("x");
		String str1 = new String("x").intern();
		System.out.println(str == str1);
		
		if ( s1 == s2 ){
			System.out.println("s1 and s2 are same");  // 1.
		}
		
		if ( s1 == s3 ){
			System.out.println("s1 and s3 are same" );  // 2.
		}
		
		if ( s1 == s4 ){
			System.out.println("s1 and s4 are same" );  // 3.
		}
		
		if ( s1 == s5 ){
			System.out.println("s1 and s5 are same" );  // 4.
		}
	}
}
