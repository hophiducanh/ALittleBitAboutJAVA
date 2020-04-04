package com.tellyouiam.regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFlag {
    public static void main(String[] args) {
        //Literal pattern is like Pattern.quote
        Pattern pt = Pattern.compile("\ndog", Pattern.LITERAL);
        Matcher mc = pt.matcher("\ndogDoG");
        while(mc.find())
        {

            System.out.printf("I have found %s starting at the " +
                    "index %s and ending at the index    %s%n",mc.group(),mc.start(),mc.end());

        }


    }
}
