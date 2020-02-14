package com.tellyouiam.regex.pattern;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MatchDatePattern {
	
	private static final String IS_DATE_MONTH_YEAR_FORMAT = "^(?:(?:31([/\\-.])(?:0?[13578]|1[02]))\\1|" +
			"(?:(?:29|30)([/\\-.])(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|" +
			"^(?:29([/\\-.])0?2\\3(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00)))$|" +
			"^(?:0?[1-9]|1\\d|2[0-8])([/\\-.])(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
	
	private static final String IS_MONTH_DATE_YEAR_FORMAT = "^(?:(?:(?:0?[13578]|1[02])([/\\-.])31)\\1|" +
			"(?:(?:0?[13-9]|1[0-2])([/\\-.])(?:29|30)\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|" +
			"^(?:0?2([/\\-.])29\\3(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00)))$|" +
			"^(?:(?:0?[1-9])|(?:1[0-2]))([/\\-.])(?:0?[1-9]|1\\d|2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
	
	public static String checkMMddyyyyFormat(String rawAddedDate) {
		String addedDate = "";
		
		if (rawAddedDate.matches(IS_DATE_MONTH_YEAR_FORMAT)) {
			addedDate = rawAddedDate;
			System.out.println(addedDate);
		} else {
			DateTimeFormatter formatter = null;
			if (rawAddedDate.matches(IS_MONTH_DATE_YEAR_FORMAT)) {
				formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				System.out.println("THIS IS MM/dd/yyyy format.");
			}
			
			DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			if (formatter != null) {
				addedDate = LocalDate.parse(rawAddedDate, formatter).format(formatter2);
			}
			System.out.println(addedDate);
		}
		return addedDate;
	}
	
	public static void main(String[] args) {
		String leapYearDate = "29/02/2100";
		String rawAddedDate = "12/13/2020";
//		checkMMddyyyyFormat(rawAddedDate);
		
		String addedDate = "";
		String date = "8/08/2013";
		if (date.matches(IS_MONTH_DATE_YEAR_FORMAT)) {
			System.out.println("MM/dd/yyyy matched");
			DateTimeFormatter rawFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			DateTimeFormatter expectedFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try {
				addedDate = LocalDate.parse(rawAddedDate, rawFormatter).format(expectedFormatter);
			} catch (DateTimeParseException e) {
				e.printStackTrace();
			}
		}
		System.out.println(addedDate);
		
	}
}
