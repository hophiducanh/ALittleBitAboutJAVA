package com.tellyouiam.datetime.java8.timezone;

import org.apache.commons.lang3.StringUtils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_TIME;
import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
import static org.apache.commons.lang3.StringUtils.*;

public class FormatDateWithTimeZone {
	private static final char HYPHEN = '-';
	private static final char COLON = ':';
	
	private static final DateTimeFormatter LOCAL_DATE_TIME;
	static {
		LOCAL_DATE_TIME = new DateTimeFormatterBuilder()
				.append(ISO_LOCAL_DATE)
				.appendLiteral(SPACE)
				.append(ISO_LOCAL_TIME)
				.toFormatter();
	}
	
	public static void main(String[] args) {
		
		String date = "2019-11-28 03:06:25";
		//DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		final ZoneId zoneId = ZoneOffset.UTC;
		LocalDateTime localDateTime = LocalDateTime.parse(date, LOCAL_DATE_TIME);
		
		ZonedDateTime d = ZonedDateTime.ofInstant(new Date().toInstant(),
				ZoneId.of("US/Hawaii"));
		//System.out.println(d);
		
		Instant instant = LocalDateTime.parse(                        // Parse string as value without time zone and
				// without offset-from-UTC.
				date,
				LOCAL_DATE_TIME
		)                                           // Returns a `LocalDateTime` object.
				.atZone(ZoneId.of("Pacific/Kiritimati"))  // Assign time zone, to determine a moment. Returns a
				// `ZonedDateTime` object.
				.toInstant();                                // Adjusts from zone to UTC.
//				.toString();// Generate string: 2017-01-23T17:34:00Z
		
		String format = DateTimeFormatter.ISO_INSTANT.format(instant);
		String format1 = LocalDateTime.parse(format, ISO_OFFSET_DATE_TIME).format(ISO_LOCAL_DATE);
		System.out.println("format = " + format);
	}
}
