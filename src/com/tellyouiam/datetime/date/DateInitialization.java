package com.tellyouiam.datetime.date;

import java.util.Date;

public class DateInitialization {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //get time return milliseconds from epoch time until now
        System.out.println(date.getTime());
    }
}
