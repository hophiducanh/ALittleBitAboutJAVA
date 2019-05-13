package com.tellyouiam.calendardata;

import java.time.LocalDate;
import java.time.Period;

public class Immutability {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2017, 1, 31);
        Period period1 = Period.ofMonths(1);
        System.out.println(period1.getYears());
        System.out.println(period1.toString());
        System.out.println(date1);
        date1.plus(period1);
        System.out.println(date1);
        LocalDate date2 = date1.plus(period1);
        System.out.println(date2);
    }
}
