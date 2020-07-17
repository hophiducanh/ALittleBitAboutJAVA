package com.tellyouiam.datetime.java8.datetime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class LocalDateExample {
	public static void main(String[] args) {
		Date publishDate = new Date();
		int lockInDay = 5;
		final LocalDate plusDays = LocalDate.from(publishDate.toInstant().atZone(ZoneId.systemDefault())).plusDays(lockInDay);
		final LocalDate now = LocalDate.now();
		System.out.println(plusDays.isAfter(now));
	}
}
