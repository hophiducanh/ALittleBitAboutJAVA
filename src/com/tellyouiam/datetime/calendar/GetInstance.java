package com.tellyouiam.datetime.calendar;

import java.util.Calendar;
import java.util.Date;

public class GetInstance {
    public static void main(String[] args) {
        //return default current Calendar
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        long unixPlusTime = (long) (2) * 24 * 60 * 60 * 1000;
        cal.setTimeInMillis(new Date().getTime() + unixPlusTime); //Set time next two day from now
        System.out.println(cal.getTime());
    }
}
