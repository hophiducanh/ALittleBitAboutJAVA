package com.tellyouiam.datetime;

import java.util.Calendar;
import java.util.Date;

/**
 * @author : Ho Anh
 * @since : 29/08/2019, Thu
 **/
public class GetTimeBackFromDate {
	public static void main(String[] args) {
		Date currentDate = new Date(1995,10,10);
		for (int i = 0; i  < 10; i++) {
			System.out.println(currentDate);
			Calendar cal = Calendar.getInstance();
			System.out.println(cal);
// remove next line if you're always using the current time.
			cal.setTime(currentDate);
			cal.add(Calendar.HOUR, -1);
			Date oneHourBack = cal.getTime();
			System.out.println(oneHourBack);
		}
	}
}
