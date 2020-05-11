package com.tellyouiam.datetime.java8.practice;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class ParseString {
	public static void main(String[] args) {
		String[] dates = { "2012-01-05T21:21:52.834Z", "2012-01-05" };
		
		DateTimeFormatter formatter =
				new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd['T'HH:mm:ss.SSSz]")
						//parse append default value
						.parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
						.parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
						.parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
						.parseDefaulting(ChronoField.NANO_OF_SECOND, 0)
						.parseDefaulting(ChronoField.OFFSET_SECONDS, 0)
						.toFormatter();
		for (String date : dates) {
			ZonedDateTime zonedDateTime = ZonedDateTime.parse(date, formatter);
			System.out.println(zonedDateTime.toEpochSecond() * 1000);
		}
	}
}
