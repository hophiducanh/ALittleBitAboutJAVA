package com.tellyouiam.datetime.java8.timezone;

import java.time.ZoneId;
import java.time.zone.ZoneRules;

public class ZoneRulesClass {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        ZoneRules zoneRules = zoneId.getRules();
        System.out.println(zoneRules);
    }
}
