package com.tellyouiam.datetime.java8.timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertUTCToAustraliaTime {
	public static void main(String[] args) {
		ZoneId australia = ZoneId.of("Australia/Sydney");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime localDateTime = LocalDateTime.parse("2031-04-25 18:30:00", formatter);
		
		ZonedDateTime calcuttaZonedDateTime = localDateTime.atZone(ZoneOffset.UTC)
				.withZoneSameInstant(australia);
		System.out.println("calcuttaZonedDateTime = " + calcuttaZonedDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
	}
}
