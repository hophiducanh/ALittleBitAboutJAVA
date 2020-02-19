package com.tellyouiam.datetime.java8.timezone;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class GetDefaultTimeZone {
	public static void main(String[] args) {
		ZoneOffset o = ZoneId.systemDefault().getRules().getOffset(Instant.now());
		System.out.println(o.getId());
	}
}
