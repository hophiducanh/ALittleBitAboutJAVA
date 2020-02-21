package com.tellyouiam.datetime.java8.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ConvertLocalDateTimeToLocalDate {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		int days = localDateTime.getDayOfMonth();
		int months = localDateTime.getMonthValue();
		int year = localDateTime.getYear();
		LocalDate localDate = LocalDate.of(year, months, days);
		System.out.println(localDateTime);
		System.out.println(localDate);
		
		System.out.println("**************************");
		LocalDate x = LocalDate.from(localDateTime.truncatedTo(ChronoUnit.DAYS));
		System.out.println(x);
	}
}
