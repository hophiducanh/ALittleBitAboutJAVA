package com.tellyouiam.datetime.java8.compare;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Calendar;
import java.util.Date;

public class CompareDate {
	public static void main(String[] args) {
		Date date0 = new Date(1601519530000L);
		Date date1 = new Date(1601519540000L);
//		System.out.println(date0.compareTo(date1) <= 0);
//		System.out.println(date0.before(date1));
		
		System.out.println(DateUtils.truncate(date0, Calendar.YEAR));
		
		int year = 2020;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.DAY_OF_YEAR, 1);
		Date start = cal.getTime();

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, 11); // 11 = december
		cal.set(Calendar.DAY_OF_MONTH, 31); // new years eve
		
		Date end = cal.getTime();
	}
}
