package com.tellyouiam.datetime.java8.clock;

import java.time.Clock;
import java.time.Instant;

public class ClockClassTest {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        Instant instant = clock.instant();
        System.out.println(instant);

        Clock clockUTC = Clock.systemUTC();
        System.out.println("UTC time :: " + clockUTC.instant());

        Clock clockZone = Clock.systemDefaultZone();
        System.out.println(clockZone);
    }
}
