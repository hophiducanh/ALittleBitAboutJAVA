package com.tellyouiam.json.objectmapper.readvalue;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
	private static final ObjectMapper mapper = new ObjectMapper();
	
	public static void main(String[] args) throws IOException {
		String message = "{\"siteId\":\"39963\"}";
		
		BookingMessage bookingMessage = mapper.readValue(message, BookingMessage.class);
		System.out.println(bookingMessage.toString());
	}
}
