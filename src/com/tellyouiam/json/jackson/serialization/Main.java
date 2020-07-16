package com.tellyouiam.json.jackson.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
	//https://www.baeldung.com/jackson-map
	private static ObjectMapper mapper = new ObjectMapper();
	public static void main(String[] args) throws JsonProcessingException {
		
		Map<MyPair, String> map = new HashMap<>();
		MyPair key = new MyPair("Abbott", "Costello");
		map.put(key, "Comedy");
		
		String jsonResult = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(map);
		System.out.println("jsonResult = " + jsonResult);
	}
}
