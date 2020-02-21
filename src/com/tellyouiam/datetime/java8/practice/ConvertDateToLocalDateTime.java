package com.tellyouiam.datetime.java8.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ConvertDateToLocalDateTime {
	public static void main(String[] args) {
		Date fromDate = new Date(1582185654000L); //Thu Feb 20 15:00:54 ICT 2020
		System.out.println(fromDate);
		LocalDateTime reqFromDate = LocalDateTime.ofInstant(fromDate.toInstant(), ZoneOffset.UTC); //2020-02-20T08:00:54
//		LocalDateTime reqFromDate = LocalDateTime.ofInstant(fromDate.toInstant(), ZoneId.of("US/Alaska")); //ZoneIdMatter //2020-02-19T23:00:54
		System.out.println(reqFromDate);
		
		
		Date x = new Date(1582243200000L);
		//System.out.println(x);
		
		LocalDateTime reqToDate = LocalDateTime.of(2020,2,20,0,0,0);
		Date toDateArg = Date.from(reqToDate.minusHours(11).toInstant(ZoneOffset.UTC)); //still affected by timezone. if you change local timezone, result will change according to timezone
		System.out.println("Date" + toDateArg);
	}
}
