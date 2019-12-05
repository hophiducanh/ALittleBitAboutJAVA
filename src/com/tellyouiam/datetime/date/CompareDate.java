package com.tellyouiam.datetime.date;

import java.util.*;

public class CompareDate {
	public static void main(String[] args) {
		if (new Date().after(new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime())) {
			//System.out.println("a");
		}
		
		Date a = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
		Date b = new GregorianCalendar(2015, Calendar.FEBRUARY, 11).getTime();
		Date c = new GregorianCalendar(2016, Calendar.FEBRUARY, 11).getTime();
		
		List<Date> dates = Arrays.asList(a,b,c);
		dates.sort(Collections.reverseOrder());
		Date y = dates.get(0);
		System.out.println(y);
		dates.sort(null);
	}
}
