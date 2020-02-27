package com.tellyouiam.datetime.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;
import static java.time.temporal.ChronoField.YEAR;

public class SubtractDayFromString {
	private static final DateTimeFormatter AUS_CUSTOM_LOCAL_DATE;
	static {
		AUS_CUSTOM_LOCAL_DATE = new DateTimeFormatterBuilder()
				.appendValue(DAY_OF_MONTH, 1,2, SignStyle.NEVER)
				.appendLiteral('/')
				.appendValue(MONTH_OF_YEAR, 1, 2, SignStyle.NEVER)
				.appendLiteral('/')
				.appendValue(YEAR, 2,4,SignStyle.NEVER)
				.toFormatter();
	}
	
	public static void main(String[] args) {
		String str = "26/02/2020";
		String result = LocalDate.parse(str, AUS_CUSTOM_LOCAL_DATE).minusDays(1).format(AUS_CUSTOM_LOCAL_DATE);
		System.out.println(result);
	}
}
