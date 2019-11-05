package com.tellyouiam.string.replace;

import java.util.stream.Stream;

/**
 * @author : Ho Anh
 * @since : 30/09/2019, Mon
 **/
public class ReplaceAll {
	public static final String MULTIPLE_SPACES_PATTERN = "[\\s]{2,}";
	
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
		
		String name = "Bourke,                 Df And Ej";
		String displayName = name.replace("\"", "").trim().replaceAll(MULTIPLE_SPACES_PATTERN, " ");
		System.out.println("DisplayName: " + displayName);
		
		String mail = "com;";
		String exMail = mail.substring(0, mail.length() - 1);
		System.out.println(mail.length());
		System.out.println("Email: "+ exMail);
	}
}
