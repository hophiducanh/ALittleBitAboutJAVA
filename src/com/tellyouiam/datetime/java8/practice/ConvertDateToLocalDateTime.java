package com.tellyouiam.datetime.java8.practice;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ConvertDateToLocalDateTime {
	public static void main(String[] args) {
		Date fromDate = new Date(1582185654000L);
		System.out.println(fromDate);
//		LocalDateTime reqFromDate = LocalDateTime.ofInstant(fromDate.toInstant(), ZoneOffset.UTC);
		LocalDateTime reqFromDate = LocalDateTime.ofInstant(fromDate.toInstant(), ZoneId.of("US/Alaska")).truncatedTo(ChronoUnit.DAYS); //ZoneIdMatter
		System.out.println(reqFromDate);
	}
}
