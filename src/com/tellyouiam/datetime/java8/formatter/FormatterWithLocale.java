package com.tellyouiam.datetime.java8.formatter;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

//TODO: http://giasutinhoc.vn/lap-trinh/lap-trinh-java-co-ban/internationalization-va-localization-trong-java-bai-9/
public class FormatterWithLocale {
	public static void main(String[] args) {
		DateTimeFormatter fmm = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
				.withLocale(new Locale("vi", "VN"))
				.withZone(ZoneId.systemDefault());
		
		Instant i = Instant.now();
		String output = fmm.format(i);
		System.out.println("output = " + output);
	}
}
