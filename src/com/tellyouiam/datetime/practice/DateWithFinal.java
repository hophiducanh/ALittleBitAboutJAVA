package com.tellyouiam.datetime.practice;

import java.util.Date;

public class DateWithFinal {
	// When should Java programmers prefer to use
	// final Date now = new Date();
	// over
	// Date now = new Date();
	public static void main(String[] args) {
		final Date now = new Date();
		
		//final Date can't make Date become immutability.
		System.out.println(now);
		//you can't:
		//now = new Date(now.getTime());
		
		//but you can:
		now.setHours(5);
		System.out.println(now);
	}
}
