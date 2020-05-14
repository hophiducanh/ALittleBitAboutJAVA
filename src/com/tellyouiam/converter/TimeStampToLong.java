package com.tellyouiam.converter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStampToLong {
	public static void main(String[] args) {
		String timeStamp = "2018-07-02 02:00:00 GMT";
		String[] parts = timeStamp.split("\\p{Z}");
		String datePart = parts[0];
		String timePart = parts[1];
		
		//cannot parse if missing time zone part
		long x = ZonedDateTime.parse(timeStamp,
				DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss z"))
				.toInstant().toEpochMilli();
		
		System.out.println(x);
		
		long epochMili = 1589427643000L;
		ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(epochMili), ZoneOffset.UTC);
		String dateStr = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss z").format(zdt);
		System.out.println(dateStr);
	}
}
