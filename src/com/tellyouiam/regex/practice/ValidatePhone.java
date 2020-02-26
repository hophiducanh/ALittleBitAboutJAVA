package com.tellyouiam.regex.practice;

import org.apache.commons.lang3.StringUtils;

public class ValidatePhone {
	private static String readMobilePhoneNumber(String phone) {
		if (StringUtils.isNotEmpty(phone)) {
			if (!phone.matches("[\\d+()\\-\\s.]+")) {
				phone = phone.replaceAll("[^\\d+()\\-\\s.]+", "");
			}
		}
		return phone;
	}
	
	private static boolean isValidPhoneMobileFaxNumber(String number) {
		if (StringUtils.isNotEmpty(number)) {
			return !number.matches("^[\\d+()\\-\\s.]+$");
		}
		return false;
	}
	
	public static void main(String[] args) {
		String a = "=0011-6568921771";
		String b = "=0011-6568921771 Ac'";
		String c = "=0011-6568921771 ";
		String d = "=0011-6568921771?";
		String e = "=0011-6568 ??56 921771?";
		String k = "a@b";
		System.out.println("=0011-6568921771: " + readMobilePhoneNumber(a));
		System.out.println("=0011-6568921771 Ac': " + readMobilePhoneNumber(b));
		System.out.println("=0011-6568921771  : " + readMobilePhoneNumber(c));
		System.out.println("=0011-6568921771? : " + readMobilePhoneNumber(d));
		System.out.println("=0011-6568921771? : " + readMobilePhoneNumber(d));
		System.out.println("=0011-6568 ?? 921771? " + readMobilePhoneNumber(d));
		System.out.println("a@b: " + readMobilePhoneNumber(k));
		
		
		String str = "";
		System.out.println(isValidPhoneMobileFaxNumber(str));
	}
}
