package com.tellyouiam.datetime.practice;

import java.util.concurrent.TimeUnit;

/**
 * @author : Ho Anh
 * @since : 07/11/2019, Thu
 **/
public class DIffTwoDates {
	public static void main(String[] args) {
		//Convert milliseconds to days.
		System.out.println(TimeUnit.DAYS.convert(600851475143L, TimeUnit.MILLISECONDS));
	}
}
