package com.tellyouiam.datetime.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DiffBetweenTwoDate {
	private static long getDateDiff(Date date1, Date date2) {
		long diffInMillies = date2.getTime() - date1.getTime();
		return TimeUnit.MINUTES.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}
	
	public static void main(String[] args) {
		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy");
		Date date2 = null;
		try {
			date2 = simpleDateFormat.parse("08051997");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if (date2 != null) {
			long day = getDateDiff(date2,date1);
			System.out.println(day);
		}
	}
}
