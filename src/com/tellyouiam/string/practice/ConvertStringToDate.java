package com.tellyouiam.string.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;

import static java.time.temporal.ChronoField.*;

public class ConvertStringToDate {
	
	
	private static final DateTimeFormatter AUSTRALIA_FORMAL_DATE_FORMAT;
	static {
		AUSTRALIA_FORMAL_DATE_FORMAT = new DateTimeFormatterBuilder()
				.appendValue(DAY_OF_MONTH, 2)
				.appendLiteral(' ')
				.appendValue(MONTH_OF_YEAR)
				.appendLiteral(',')
				.appendLiteral(' ')
				.appendValue(YEAR, 4)
				.toFormatter();
	}
	
	public static void main(String[] args) throws ParseException {
		//https://stackoverflow.com/questions/46305245/parsing-with-java-8-datetimeformatter-and-spanish-month-names
		DateTimeFormatter fmt = new DateTimeFormatterBuilder()
				// case insensitive
				.parseCaseInsensitive()
				// pattern with full month name (MMMM)
				.appendPattern("MMMM yyyy")
				// set locale
				.toFormatter(new Locale("es", "ES"));
		// now it works
		fmt.parse("Mayo 2017");
		
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
		
		String date = "28 April, 2020";
		
		
		//parse case insensitive
		LocalDate formattedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd MMMM, yyyy"));
		//LocalDate formattedDate = LocalDate.parse(date, AUSTRALIA_FORMAL_DATE_FORMAT);
		System.out.println(formattedDate);
	}
}
