package com.tellyouiam.datetime.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
public class SimpleDateFormatPractice {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		Date date = dateFormat.parse("2001.07.04 AD at 12:08:56 PDT");
		System.out.println(date);
	}
}
