package com.tellyouiam.string.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class ConvertStringToDate {
	public static void main(String[] args) throws ParseException {
		String str = "29/08/2019";
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date result = format.parse(str);
		String abc = format.format(result);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d/M/yyyy");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/M/yyyy");
		
		DateTimeFormatter dtf = new DateTimeFormatterBuilder()
				.appendOptional(formatter)
				.appendOptional(formatter1)
				.appendOptional(formatter2)
				.appendOptional(formatter3)
				.toFormatter();
		String horseDate = LocalDate.parse(str, dtf).format(formatter);
		System.out.println(horseDate);
	}
}
