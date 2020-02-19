package com.tellyouiam.datetime.java8.timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class ZoneOffsetClass {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		ZoneId zone = ZoneId.of("Europe/Berlin");
		ZoneOffset zoneOffSet = zone.getRules().getOffset(now);
		System.out.println(zoneOffSet);
		
		ZoneId z = ZoneOffset.systemDefault();
		System.out.println(z);
	}
}
