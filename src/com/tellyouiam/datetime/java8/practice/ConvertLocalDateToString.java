package com.tellyouiam.datetime.java8.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.HOUR_OF_DAY;
import static java.time.temporal.ChronoField.MINUTE_OF_HOUR;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;
import static java.time.temporal.ChronoField.SECOND_OF_MINUTE;
import static java.time.temporal.ChronoField.YEAR;

public class ConvertLocalDateToString {
	//https://stackoverflow.com/questions/44000719/datetimeformatter-include-optional-field-based-on-the-value-of-another-field
	private static final DateTimeFormatter ISO_LOCAL_DATE;
	static {
		ISO_LOCAL_DATE = new DateTimeFormatterBuilder()
				.appendValue(YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
				.appendLiteral('-')
				.appendValue(MONTH_OF_YEAR, 2)
				.appendLiteral('-')
				.appendValue(DAY_OF_MONTH, 2)
				.appendLiteral(" ")
				.appendValue(HOUR_OF_DAY, 2)
				.appendLiteral(':')
				.appendValue(MINUTE_OF_HOUR, 2)
				.optionalStart()
				.appendLiteral(':')
				.appendValue(SECOND_OF_MINUTE, 2)
				.toFormatter();
	}
	
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2020, 2,19, 2, 4, 30);
		
		
		String toDateStr = date.minus(11, ChronoUnit.HOURS).format(ISO_LOCAL_DATE.withZone(ZoneOffset.UTC));
		
		String str = "2020-02-18 15:04:30";
		LocalDateTime dateTime = LocalDateTime.parse(str, ISO_LOCAL_DATE);
		
		LocalDateTime addedDateTime = LocalDateTime.parse(dateTime.plusHours(10).format(ISO_LOCAL_DATE.withZone(ZoneOffset.UTC)));
		System.out.println(addedDateTime);
//		System.out.println(toDateStr);
		System.out.println(dateTime); //2020-02-18T15:04:30
	}
}
