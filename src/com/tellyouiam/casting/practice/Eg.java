package com.tellyouiam.casting.practice;

/**
 * @author : Ho Anh
 * @since : 21/02/2020, Fri
 **/
public class Eg {
	public static void main(String[] args) {
		//byte range from -128 to 127 >> casting return -126
		//narrow conversion need explicitly casting (convert byte to int).
		byte myLargeValueByte = (byte) 130;
		System.out.println(myLargeValueByte);
		
		//convert long to int (widening conversion don't need to explicitly casting)
		long longToInt = 130;
		System.out.println(longToInt);
		
		char myLargeValueChar = (char) myLargeValueByte;
		//0b11111111 10000010 unsigned value
		int myLargeValueInt = myLargeValueChar; //0b11111111 10000010 65410
		System.out.println(myLargeValueInt);
		
		
		
	}
}
