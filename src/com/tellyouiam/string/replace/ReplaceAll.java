package com.tellyouiam.string.replace;

import java.util.stream.Stream;

/**
 * @author : Ho Anh
 * @since : 30/09/2019, Mon
 **/
public class ReplaceAll {
	public static void main(String[] args) {
		String[] emails = new String[]{
			"contact.hoducanh@gmail.com; anh.ho@fruitful.io",
			"contact.hoducanh@gmail.com;anh.ho@fruitful.io",
			"contact.hoducanh@gmail.com ;anh.ho@fruitful.io",
			"contact.hoducanh@gmail.com ; anh.ho@fruitful.io"};

		for (String email : emails) {
			email = email.replaceAll("([\\s]?);([\\s]?)", ";");
			System.out.println(email);
		}

		String[] addresses = Stream.of("Ha    noi,   BTL", "Duc     Anh", "Hello WOW").toArray(String[]::new);
		for (String address : addresses) {
			address  = address.trim().replaceAll("[\\s]{2,}", " ");
			System.out.println(address);
		}
	}
}
