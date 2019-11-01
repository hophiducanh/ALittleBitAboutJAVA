package com.tellyouiam.datetime.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Reference: https://stackoverflow.com/questions/26962388/printing-a-calendar
 * */
public class PrintingCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2014, 1, 06);
        calendar.set(Calendar.DAY_OF_MONTH, 1); //Set the day of month to 1
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); //get day of week for 1st of month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        //print month name and year
        System.out.println(new SimpleDateFormat("MMMM YYYY").format(calendar.getTime()));
        System.out.println(" S  M  T  W  T  F  S");

        //print initial spaces
        StringBuilder initialSpace = new StringBuilder();
        for (int i = 0; i < dayOfWeek - 1; i++) {
            initialSpace.append("   ");
        }
        System.out.print(initialSpace);

        //print the days of the month starting from 1
        for (int i = 0, dayOfMonth = 1; dayOfMonth <= daysInMonth; i++) {
            for (int j = ((i == 0) ? dayOfWeek - 1 : 0); j < 7 && (dayOfMonth <= daysInMonth); j++) {
                System.out.printf("%2d ", dayOfMonth);
                dayOfMonth++;
            }
            System.out.println();
        }
    }
}
