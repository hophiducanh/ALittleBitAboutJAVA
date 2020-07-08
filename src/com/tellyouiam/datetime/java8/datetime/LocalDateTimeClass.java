package com.tellyouiam.datetime.java8.datetime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
* The reason is that LocalDateTime does not record Time Zone after instances are created.
* You cannot convert a date time without time zone to another date time based on a specific time zone.
* As a matter of fact, LocalDateTime.now() should never be called in production code unless your purpose is getting random results.
* When you construct a LocalDateTime instance like that, this instance contains date time ONLY based on current server's time zone,
* which means this piece of code will generate different result if it is running a server with a different time zone config.
* LocalDateTime can simplify date calculating. If you want a real universally usable data time, use ZonedDateTime or OffsetDateTime:
*
* */
public class LocalDateTimeClass {
	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();            //Local date time
		
		ZoneId zoneId = ZoneId.of( "Asia/Kolkata" );        //Zone information
		
		ZonedDateTime zdtAtAsia = ldt.atZone( zoneId );     //Local time in Asia timezone
		
		ZonedDateTime zdtAtET = zdtAtAsia
				.withZoneSameInstant( ZoneId.of( "America/New_York" ) ); //Sama time in ET timezone
		
		//Local date time doesn't contain time zone. If you want to convert localDateTime to ZoneDateTime you need extra ZoneId.
		
		// public static LocalDateTime now() {
		//        return now(Clock.systemDefaultZone());
		//    }
		Clock clock = Clock.systemDefaultZone();
		System.out.println("Default LocalDateTime timezone : " + clock.getZone()); //Asia/Bangkok
	}
}
