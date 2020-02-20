package com.tellyouiam.datetime.java8.practice;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

public class SubtractHourFromLocalDate {
	public static void main(String[] args) {
		LocalDateTime reqFromDate = LocalDateTime.of(2020,1,1,20,0,0);
		System.out.println(reqFromDate);
		Date date = Date.from(reqFromDate.minusHours(18).toInstant(ZoneOffset.UTC));
		Date d = Date.from(reqFromDate.minusHours(11).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("UTC: " + date);
		System.out.println("System TimeZone: " + d);
	}
}
