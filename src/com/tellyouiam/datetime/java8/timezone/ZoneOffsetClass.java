package com.tellyouiam.datetime.java8.timezone;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ZoneOffsetClass {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		ZoneId zone = ZoneId.of("Europe/Berlin");
		ZoneOffset zoneOffSet = zone.getRules().getOffset(now);
		System.out.println(zoneOffSet);
		
		ZoneId z = ZoneOffset.systemDefault();
		System.out.println(z);
		int x  = OffsetDateTime.now().getOffset().getTotalSeconds();
		System.out.println(x/3600);

		System.out.println(OffsetDateTime.now().getOffset().get(ChronoField.OFFSET_SECONDS));
	}
}
