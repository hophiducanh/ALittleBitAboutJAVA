package com.tellyouiam.regex.practice;

import java.util.Arrays;

public class CsvCommaSplitValue {
    public static void main(String[] args) {
        String str = "123,test,444,\"don't split, this\",more test,1";
        String[] ls = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

//        String regex =
//                ",      #comma \n" +
//                    "(?=   #folowed by\n"  +
//                            "(?:  # start non-capture group\n"  +

        String regex = "(?x)   " +
                ",         # Split on comma" +
                "(?=       #Followed by " +
                "  (?:     #Start a non-capture group " +
                "    [^\"]* #0 or more non-quote characters" +
                "    \"     #1 quote" +
                "    [^\"]* #0 or more non-quote characters" +
                "    \"     #1 quote" +
                "  )*       #0 or more repetition of non-capture group (multiple of 2 quotes will be even)" +
                "  [^\"]*   #Finally 0 or more non-quotes" +
                "  $        #Till the end  (This is necessary, else every comma will satisfy the condition)" +
                ")          #End look-ahead";

        String[] arr = str.split(regex);
        System.out.println(Arrays.toString(arr));
    }
}
