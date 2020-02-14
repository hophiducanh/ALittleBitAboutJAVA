package com.tellyouiam.datetime.calendar;

import java.util.Calendar;

public class AddDayRange {
	private static Calendar addDaysRange(Calendar date, int days) {
		Calendar cal = (Calendar) date.clone();
		cal.add(Calendar.DATE, days);
		
		return cal;
	}
	
	public static void main(String[] args) {
		Calendar calStart = Calendar.getInstance();
		Calendar calEnd = Calendar.getInstance();
		
		calEnd = addDaysRange(calStart, 7);
		calStart = addDaysRange(calStart, -30);
		
		System.out.println(calEnd);
		System.out.println(calStart);
	}
}
