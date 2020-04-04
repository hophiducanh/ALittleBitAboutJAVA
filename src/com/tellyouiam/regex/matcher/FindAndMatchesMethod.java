package com.tellyouiam.regex.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndMatchesMethod {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("xyz");

        Matcher m = p.matcher("123xyzabc");
        System.out.println(m.find());    // true
        System.out.println(m.matches()); //false
        // find() succeeds if a match can be found anywhere in the target string,
        // while matches() expects the regex to match the entire string. Matcher.matches() >> to match entire string
        // https://stackoverflow.com/questions/3651725/match-multiline-text-using-regular-expression
    }
}
