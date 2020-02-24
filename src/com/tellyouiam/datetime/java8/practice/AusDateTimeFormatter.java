package com.tellyouiam.datetime.java8.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;
import static java.time.temporal.ChronoField.YEAR;

public class AusDateTimeFormatter {
	private static final DateTimeFormatter CUSTOM_LOCAL_DATE_TIME;
	static {
		CUSTOM_LOCAL_DATE_TIME = new DateTimeFormatterBuilder()
				.appendValue(DAY_OF_MONTH, 1, 2, SignStyle.NEVER)
				.appendLiteral('/')
				.appendValue(MONTH_OF_YEAR, 1, 2, SignStyle.NEVER)
				.appendLiteral('/')
				.appendValue(YEAR, 2, 4, SignStyle.NEVER)
				.toFormatter();
	}
	
	public static void main(String[] args) {
		String inputDate = "17/5/1997";
		DateTimeFormatter expectedFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter = new DateTimeFormatterBuilder()
				.appendOptional(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				.appendOptional(DateTimeFormatter.ofPattern("dd/M/yyyy"))
				.appendOptional(DateTimeFormatter.ofPattern("d/MM/yyyy"))
				.appendOptional(DateTimeFormatter.ofPattern("d/M/yyyy"))
				.toFormatter();
		
		String date = LocalDate.parse(inputDate, formatter).format(expectedFormatter);
		//System.out.println(date);
		
		String ausFormat = LocalDate.parse(inputDate, CUSTOM_LOCAL_DATE_TIME).format(expectedFormatter);
		System.out.println(ausFormat);
	}
}
