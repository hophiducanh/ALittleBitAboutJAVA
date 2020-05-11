package com.tellyouiam.string.practice;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.format.SignStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;
import static java.time.temporal.ChronoField.YEAR;

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
		
		DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
				.appendOptional(formatter)
				.appendOptional(formatter1)
				.appendOptional(formatter2)
				.appendOptional(formatter3)
				.toFormatter();
		String horseDate = LocalDate.parse(str, dateTimeFormatter).format(formatter);
		System.out.println(horseDate);
		
		String dateString = null;
		try {
			dateString = LocalDate.parse(                   // Represent a date-only value, without time-of-day and without time zone.
					"31/02/2100",                 // Input string.
					DateTimeFormatter              // Define a formatting pattern to match your input string.
							.ofPattern("dd/MM/uuuu")
							.withResolverStyle(ResolverStyle.STRICT)  // Specify leniency in tolerating questionable inputs.
			).toString();
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		}
		System.out.println("Date: " + dateString);
		
		
		String input = "2017-02.-31";
		DateTimeFormatter dtf =
				DateTimeFormatter.ofPattern("yyyy[.][-]MM[.][-]dd").withResolverStyle(
						ResolverStyle.STRICT // smart mode truncates to Feb 28!
				);
		ParsePosition pos = new ParsePosition(0);
		TemporalAccessor ta = dtf.parseUnresolved(input, pos); // step 1
		LocalDate date = null;
		if (pos.getErrorIndex() == -1 && pos.getIndex() == input.length()) {
			try {
				//date = LocalDate.parse(input, dtf); // step 2
			} catch (DateTimeException dte) {
				dte.printStackTrace(); // in strict mode (see resolver style above)
			}
		}
		System.out.println(date);
		
	}
}
