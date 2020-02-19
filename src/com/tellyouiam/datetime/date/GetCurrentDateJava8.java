package com.tellyouiam.datetime.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GetCurrentDateJava8 {
	public static void main(String[] args) {
		String addedDate = "";
		DateTimeFormatter expectedFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate currentDate = LocalDate.now();
		addedDate = currentDate.format(expectedFormatter);
		System.out.println(addedDate);
	}
}
