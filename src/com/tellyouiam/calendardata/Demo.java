package com.tellyouiam.calendardata;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Demo {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDate bday = null;

        try {
            bday = LocalDate.parse(args[0], f);
        } catch (java.time.DateTimeException e) {
            System.out.println("bad dates Indy");
            System.exit(0);
        }
        System.out.println("a " + bday.getDayOfWeek());

        Period p1 = Period.between(bday, LocalDate.now());

        System.out.println("you've lived for: ");
        System.out.println(p1.getDays() + " days, ");
        System.out.println(p1.getMonths() + "months, ");
        System.out.println(p1.getYears() + "years");
    }
}
