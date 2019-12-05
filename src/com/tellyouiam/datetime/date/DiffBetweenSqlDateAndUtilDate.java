package com.tellyouiam.datetime.date;

import java.util.Calendar;
import java.util.Date;

public class DiffBetweenSqlDateAndUtilDate {
	public static void main(String[] args) {
		System.out.println(new Date(0));
		java.sql.Date date = new java.sql.Date(0);
		System.out.println("sqlDate: " + date);
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
	}
}
