package com.tellyouiam.datetime.java8.timezone;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

//A time-zone offset from Greenwich/UTC
public class ZoneOffsetClass {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		ZoneId zone = ZoneId.of("Europe/Berlin");
		System.out.println("ZoneId: " + zone);
		ZoneOffset zoneOffSet = zone.getRules().getOffset(now);
		System.out.println("ZoneOffset: " + zoneOffSet);
		
		ZoneId z = ZoneOffset.systemDefault();
		System.out.println(z);
		int x  = OffsetDateTime.now().getOffset().getTotalSeconds();
		System.out.println(x/3600);

		System.out.println(OffsetDateTime.now().getOffset().get(ChronoField.OFFSET_SECONDS));

		System.out.println(ZoneId.of("+3"));
		System.out.println(ZoneId.of("Z"));
	}
}
