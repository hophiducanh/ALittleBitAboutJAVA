package com.tellyouiam.datetime.java8.timezone;

import java.time.ZoneId;

public class ZoneIdClass {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
        System.out.println(ZoneId.SHORT_IDS.get("AET"));
    }
}
