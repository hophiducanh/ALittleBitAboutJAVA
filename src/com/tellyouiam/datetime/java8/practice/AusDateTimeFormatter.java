package com.tellyouiam.datetime.java8.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;
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
				.parseLenient()
				.toFormatter()
				.withResolverStyle(ResolverStyle.LENIENT);
	}
	
	
	
	private static final String IS_DATE_MONTH_YEAR_FORMAT_PATTERN = "^(?:(?:31([/\\-.])(?:0?[13578]|1[02]))\\1|" +
			"(?:(?:29|30)([/\\-.])(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|" +
			"^(?:29([/\\-.])0?2\\3(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00)))$|" +
			"^(?:0?[1-9]|1\\d|2[0-8])([/\\-.])(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

	
	public static void main(String[] args) {
		
		String inputDate = "32/2/1997"; //auto format >> 28/02/1997
		DateTimeFormatter expectedFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter = new DateTimeFormatterBuilder()
				.appendOptional(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				.appendOptional(DateTimeFormatter.ofPattern("dd/M/yyyy"))
				.appendOptional(DateTimeFormatter.ofPattern("d/MM/yyyy"))
				.appendOptional(DateTimeFormatter.ofPattern("d/M/yyyy"))
				.toFormatter();
		
		//String date = LocalDate.parse(inputDate, formatter).format(expectedFormatter);
		//System.out.println(date);
		
		//LocalDate ausFormat = LocalDate.parse(inputDate, CUSTOM_LOCAL_DATE_TIME);
		//System.out.println(ausFormat);
		DateTimeFormatter formatX = DateTimeFormatter.ISO_LOCAL_DATE.withResolverStyle(ResolverStyle.LENIENT);
		System.out.println(LocalDate.parse("2020-12-33", formatX));
		
		DateTimeFormatter formatY = DateTimeFormatter.ISO_LOCAL_DATE.withResolverStyle(ResolverStyle.SMART);
		System.out.println(LocalDate.parse("2020-12-33", formatY));
		
		if (inputDate.matches(IS_DATE_MONTH_YEAR_FORMAT_PATTERN)) {
			System.out.println("Date matches");
		}
	}
}
