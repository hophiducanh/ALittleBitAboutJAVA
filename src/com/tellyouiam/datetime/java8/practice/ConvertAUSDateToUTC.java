package com.tellyouiam.datetime.java8.practice;

import java.time.*;

public class ConvertAUSDateToUTC {
    public static void main(String[] args) {
        ZoneId utc = ZoneId.of("UTC");
        ZoneId aus = ZoneId.of("Australia/Sydney");

        LocalDate date = LocalDate.now();

        LocalDateTime time = date.atStartOfDay();

        ZonedDateTime ausTime = time.atZone(ZoneId.systemDefault());

        ZonedDateTime zdt = ZonedDateTime.now(aus).withZoneSameInstant(utc);
        LocalDate ld = LocalDate.of(zdt.getYear(), zdt.getMonth(), zdt.getDayOfMonth());
        System.out.println(ld);
    }
}
