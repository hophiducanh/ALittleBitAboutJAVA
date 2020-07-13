package com.tellyouiam.json.jackson.objectmapper.readvalue;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class Main {
	private static final ObjectMapper mapper = new ObjectMapper();
	
	public static void main(String[] args) throws IOException {
		String message = "{\"siteId\":39963,\"id\":3503,\"dateTime\":\"2020-07-18 11:45:00\",\"duration\":225," +
				"\"status\":\"awaiting_review\",\"updatedutc\":\"2020-07-10t07:47:59z\",\"customer\":{\"email\":\"dinh" +
				".hoang+t1@fruitful.io\",\"firstName\":\"Thien\",\"lastName\":\"Huong\",\"id\":172101419}," +
				"\"employee\":{\"id\":142,\"name\":\"amanda\"},\"service\":{\"id\":664,\"name\":\"Immerse (225min)" +
				"\"}}";
		
		BookingMessage bookingMessage = mapper.readValue(message, BookingMessage.class);
		String value = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookingMessage);
		//System.out.println("value = " + value);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
		String val = gson.toJson(bookingMessage);
		System.out.println("val = " + val);
	}
}
