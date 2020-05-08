package com.tellyouiam.regex.practice;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        //System.out.println(Arrays.toString(arr));
    
        //String url = "HTTPs://VIMEO.com/320480032";
        String url = "youtube.com/embed/DFYRQ_zQ-gk";
        String externalUrl = null;
        String videoId;
    
        String youtubeUrlRegex = "^\n" +
                "((?:https?:)?//)? #protocol\n" +
                "((?:www|m)\\.)? #sub-domain\n" +
                "((?:youtube\\.com|youtu.be)) #domain name\n" +
                "(/(?:[\\w\\-]+\\?v=|embed/|v/)?) #path, query\n" +
                "([\\w\\-]+) #video id\n" +
                "(\\S+)? #fragment\n" +
                "$";
//        String youtubeUrlRegex = "^((?:https?:)?\\/\\/)?((?:www|m)\\.)?((?:youtube\\.com|youtu.be))(\\/" +
//                "(?:[\\w\\-]+\\?v=|embed\\/|v\\/)?)([\\w\\-]+)(\\S+)?$";
//
        String vimeoUrlRegex = "^\n" +
                "((?:https?:)?//)? #protocol\n" +
                "(www\\.|player\\.)? #sub-domain\n" +
                "(?:vimeo\\.com) #domain name\n" +
                "(/(?:channels/(?:\\w+/)?|groups/([^/]*)/videos/|video/|)) #path\n" +
                "(\\d+) #video id\n" +
                "(?:|/\\?) #fragment\n" +
                "$";
        
//        String vimeoUrlRegex = "^((?:https?:)?\\/\\/)?(www\\.|player\\.)?vimeo\\.com(\\/(?:channels\\/(?:\\w+\\/)" +
//                "?|groups\\/([^\\/]*)\\/videos\\/|video\\/|))(\\d+)(?:|\\/\\?)$";
//
        Matcher youtubeUrlMatcher = Pattern
                .compile(youtubeUrlRegex, Pattern.COMMENTS | Pattern.CASE_INSENSITIVE)
                .matcher(url);
    
        Matcher vimeoUrlMatcher = Pattern
                .compile(vimeoUrlRegex, Pattern.COMMENTS | Pattern.CASE_INSENSITIVE)
                .matcher(url);
    
        if (youtubeUrlMatcher.find()) {
            videoId = youtubeUrlMatcher.group(5);
            System.out.println(youtubeUrlMatcher.group(3));
            System.out.println(youtubeUrlMatcher.group(4));
            System.out.println(youtubeUrlMatcher.group(5));
            externalUrl = String.format("https://www.youtube.com/watch?v=%s", videoId);
        } else if (vimeoUrlMatcher.find()) {
            System.out.println(vimeoUrlMatcher.groupCount());
            videoId = vimeoUrlMatcher.group(5);
            System.out.println(videoId);
            externalUrl = String.format("https://vimeo.com/%s", videoId);
        }
        System.out.println(externalUrl);
    }
}
