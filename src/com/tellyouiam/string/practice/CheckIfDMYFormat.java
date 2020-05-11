package com.tellyouiam.string.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.format.SignStyle;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;
import static java.time.temporal.ChronoField.YEAR;

public class CheckIfDMYFormat {
	private static final DateTimeFormatter AUSTRALIA_CUSTOM_DATE_FORMAT;
	static {
		AUSTRALIA_CUSTOM_DATE_FORMAT = new DateTimeFormatterBuilder()
				.appendValue(DAY_OF_MONTH, 1, 2, SignStyle.NEVER)
				.appendLiteral('/')
				.appendValue(MONTH_OF_YEAR, 1, 2, SignStyle.NEVER)
				.appendLiteral('/')
				.appendValue(YEAR, 2, 4, SignStyle.NEVER)
				.toFormatter()
				.withResolverStyle(ResolverStyle.STRICT);
	}
	
	//parse strict not working because toFormatter default using ResolverStyle.SMART
	//https://stackoverflow.com/questions/41177442/uuuu-versus-yyyy-in-datetimeformatter-formatting-pattern-codes-in-java
	private static final DateTimeFormatter WRONG_FORMATTER;
	static {
		WRONG_FORMATTER = new DateTimeFormatterBuilder()
				.appendValue(DAY_OF_MONTH, 1, 2, SignStyle.NEVER)
				.appendLiteral('/')
				.appendValue(MONTH_OF_YEAR, 1, 2, SignStyle.NEVER)
				.appendLiteral('/')
				.appendValue(YEAR, 2, 4, SignStyle.NEVER)
				.parseStrict()
				.toFormatter();
	}
	
	private static boolean isDMYFormat(String date) {
		boolean isParsable = true;
		try {
			LocalDate.parse(date, AUSTRALIA_CUSTOM_DATE_FORMAT);
		} catch (DateTimeParseException e) {
			isParsable = false;
		}
		return isParsable;
	}
	
	public static void main(String[] args) {
		System.out.println(isDMYFormat("30/02/2019")); //false
	}
}
