package com.tellyouiam.datetime.java8.practice;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.HOUR_OF_DAY;
import static java.time.temporal.ChronoField.MINUTE_OF_HOUR;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;
import static java.time.temporal.ChronoField.SECOND_OF_MINUTE;
import static java.time.temporal.ChronoField.YEAR;

public class ConvertLocalDateToString {
	//https://stackoverflow.com/questions/44000719/datetimeformatter-include-optional-field-based-on-the-value-of-another-field
	private static final DateTimeFormatter CUSTOM_LOCAL_DATE_TIME;
	static {
		CUSTOM_LOCAL_DATE_TIME = new DateTimeFormatterBuilder()
				.appendValue(YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
				.appendLiteral('-')
				.appendValue(MONTH_OF_YEAR, 2)
				.appendLiteral('-')
				.appendValue(DAY_OF_MONTH, 2)
				.appendLiteral(' ')
				.appendValue(HOUR_OF_DAY, 2)
				.appendLiteral(':')
				.appendValue(MINUTE_OF_HOUR, 2)
				.optionalStart()
				.appendLiteral(':')
				.appendValue(SECOND_OF_MINUTE, 2)
				.optionalEnd()
				.toFormatter();
	}
	
	private static final DateTimeFormatter CUSTOM_LOCAL_DATE;
	static {
		CUSTOM_LOCAL_DATE = new DateTimeFormatterBuilder()
				.appendValue(DAY_OF_MONTH, 2)
				.appendLiteral('/')
				.appendValue(MONTH_OF_YEAR, 2)
				.appendLiteral('/')
				.appendValue(YEAR, 4)
				.toFormatter();
	}
	
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2020, 12,19, 23, 4, 30);
		//ZonedDateTime date = LocalDateTime.of(2020, 12,19, 23, 4, 30).atZone(ZoneId.systemDefault());
		
		String toDateStr = date.minus(11, ChronoUnit.HOURS).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME.withZone(ZoneId.of("Asia/Tokyo"))); //LocalDate time not working with zone
		LocalDateTime xx = LocalDateTime.parse(toDateStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		
		Instant newDate = new Date(System.currentTimeMillis()).toInstant().truncatedTo(ChronoUnit.SECONDS);
		Instant xxInstant = xx.toInstant(ZoneOffset.UTC);
		boolean x = newDate.isAfter(xxInstant);
		
		System.out.println(xxInstant);
		System.out.println("XXX is:" + xx);
		
		
		System.out.println("***********************************************");
		String str = "2020-02-18 15:04:30";
		LocalDateTime dateTime = LocalDateTime.parse(str, CUSTOM_LOCAL_DATE_TIME.withZone(ZoneOffset.UTC)); //2020-02-18T15:04:30
		
		LocalDateTime dateTime1 = dateTime.plusHours(10);
		String hihi = dateTime.format(CUSTOM_LOCAL_DATE_TIME);
		System.out.println(dateTime1);
//		LocalDateTime addedDateTime = LocalDateTime.parse(dateTime.plusHours(10).format(CUSTOM_LOCAL_DATE.withZone(ZoneOffset.UTC)));
//		System.out.println(addedDateTime);
		System.out.println(dateTime); //2020-02-18T15:04:30
		
		LocalDate localDate = LocalDate.of(2020, 2,19);
		String localStr = localDate.format(CUSTOM_LOCAL_DATE);
		System.out.println(localStr);
	}
}
