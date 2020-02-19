package com.tellyouiam.datetime.date;

import java.util.Date;

public class DateInitialization {
    
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //get time return milliseconds from epoch time until now
        //System.out.println(date.getTime());
        java.sql.Date date1 = new java.sql.Date(3654646L);
        System.out.println(date1);
        Date firstDate1 = new Date(15,05,20); //use java.util.Time
    }
}
