package com.tellyouiam.datetime.java8.timestamp;

import java.time.Instant;

// Java 8 cung cấp lớp Instant hỗ trợ làm việc với timestamps (chi tiết đến mili giây). Instant tính mốc thời gian từ
// giây thứ nhất của ngày 01-01-1970 gọi là EPOCH. Giá trị của nó sẽ nhận giá trị âm khi mốc thời gian trước thời
// điểm epoch.
// https://viblo.asia/p/java-8-date-and-time-api-7rVRqp04v4bP
public class InstantClass {
	public static void main(String[] args) {
		// Ngày giờ hiện tại
		Instant now = Instant.now(); //Instant represent Date, Time and Zone.
		//https://stackoverflow.com/questions/8405087/what-is-this-date-format-2011-08-12t201746-384z
		System.out.println(now); //2020-02-19T04:43:32.010Z
		// T separate date and time. OZ represent time at Zulu time (+0 UTC).
		
		// Tính theo unix timestamp
		Instant fromUnixTimestamp = Instant.ofEpochSecond(1262347200);
		// => 2010-01-01 12:00:00
		// theo mili giây
		Instant fromEpochMilli = Instant.ofEpochMilli(1262347200000L);
	}
}
