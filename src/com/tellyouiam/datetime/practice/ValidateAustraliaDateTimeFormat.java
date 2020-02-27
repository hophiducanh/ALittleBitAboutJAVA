package com.tellyouiam.datetime.practice;

import java.util.stream.Stream;

/**
 * @author : Ho Anh
 * @since : 01/10/2019, Tue
 **/
public class ValidateAustraliaDateTimeFormat {
	private static boolean validateDateTime(String dateTime) {
		return (dateTime.matches("^([0-2]?[0-9]|(3)[0-1])(/)(((0?)[0-9])|((1)[0-2]))(/)\\d{2,4}$"));
	}

	public static void main(String[] args) {
		String[] dateTimes = Stream.of("08/05/1997", "08/05/97", "38/5/1997",
			"8/25/1997", "38/25/1997", "31/05/1997", "05/12/1997", "05/13/1997").toArray(String[]::new);
		for (String dateTime : dateTimes) {
			if (validateDateTime(dateTime)) {
				System.out.println("Valid:" + dateTime);
			} else {
				System.out.println("Invalid:" + dateTime);
			}
		}
	}
}
