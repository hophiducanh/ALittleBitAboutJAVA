package com.tellyouiam.datetime.java8.yearmonth;

import java.time.LocalDate;
import java.time.YearMonth;

public class YearMonthEx {
	public static void main(String[] args) {
		final LocalDate now = LocalDate.now();
		final YearMonth from = YearMonth.from(now);
		System.out.println(from.toString());
	}
}
