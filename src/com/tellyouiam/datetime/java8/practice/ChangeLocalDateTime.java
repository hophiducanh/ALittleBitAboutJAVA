package com.tellyouiam.datetime.java8.practice;

import java.time.LocalDateTime;

public class ChangeLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime reqFromDate = LocalDateTime.of(2020,1,1,20,0,0);
		reqFromDate = reqFromDate.withHour(1);
		System.out.println(reqFromDate);
	}
}
