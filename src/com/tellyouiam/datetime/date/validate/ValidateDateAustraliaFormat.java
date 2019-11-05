package com.tellyouiam.datetime.date.validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidateDateAustraliaFormat {
    //Strict is resolver type.
    public static boolean isValid(String value, String datePattern, boolean strict) {

        if (value == null
                || datePattern == null
                || datePattern.length() <= 0) {

            return false;
        }

        SimpleDateFormat formatter = new SimpleDateFormat(datePattern);
        formatter.setLenient(false);

        try {
            formatter.parse(value);
        } catch(ParseException e) {
            return false;
        }

        if (strict && (datePattern.length() != value.length())) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String toDate = "";
        String value = toDate.replace("\"", "").trim();

        if (value == null) {
            System.out.println("true");
        }

        boolean isDateValid = isValid(toDate, "dd/MM/yyyy", false);
        if (!isDateValid) {
            System.out.println(true);
        }
    }
}
