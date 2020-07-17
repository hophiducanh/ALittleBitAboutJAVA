package com.tellyouiam.datetime.java8.practice;

import java.time.LocalDate;
import java.util.Date;
//TODO: https://www.baeldung.com/java-date-to-localdate-and-localdatetime
public class ConvertDateToLocalDate {
	public static void main(String[] args) {
		Date date =  new Date();
		final LocalDate localDate = new java.sql.Date(date.getTime()).toLocalDate();
		System.out.println(localDate);
	}
}
