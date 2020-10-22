package com.tellyouiam.json.jackson.jsonfilter;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public class JsonFilterExample {
	@JsonFilter("nameFilter")
	static class Student {
		public int id;
		int rollNo;
		public String name;
		
		Student(int id, int rollNo, String name) {
			this.id = id;
			this.rollNo = rollNo;
			this.name = name;
		}
	}
	
	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		Student student = new Student(1, 13, "Mark");
		FilterProvider filters = new SimpleFilterProvider().addFilter("nameFilter",
				SimpleBeanPropertyFilter.filterOutAllExcept("name"));
		String jsonString = mapper.writer(filters)
				.withDefaultPrettyPrinter()
				.writeValueAsString(student);
		
		System.out.println(jsonString);
	}
}
