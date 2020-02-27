package com.tellyouiam.datetime.practice;

import java.time.Instant;
import java.util.Date;

public class InstantEx {
	public static void main(String[] args) {
		Instant instant = Instant.ofEpochMilli(1576750611000L);
		System.out.println(instant);
		
		Date date = Date.from(instant);
		System.out.println(date);
		
		java.sql.Timestamp timestamp = new java.sql.Timestamp(1576750611000L);
		System.out.println("TimeStamp:" + timestamp);
	}
}
