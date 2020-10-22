package com.tellyouiam.json.jsonpath;

import com.fasterxml.jackson.databind.JsonNode;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.json.JacksonJsonNodeJsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import java.text.SimpleDateFormat;
import java.util.Date;

//https://www.baeldung.com/guide-to-jayway-jsonpath
public class JsonPathExample {
	
	private static final Configuration configuration = Configuration.builder()
			.jsonProvider(new JacksonJsonNodeJsonProvider())
			.mappingProvider(new JacksonMappingProvider())
			.build();
	
	public static void main(String[] args) {
		String json = "{\n" + "\t\"yearFoaled\" : 1157223600000,\n" + "\t\"serviceFee\" : \"50\"\n" + "}";
		Date date = JsonPath.parse(json).read("$['yearFoaled']", Date.class);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dateStr = format.format(date);
		
		JsonNode newJson = JsonPath.using(configuration)
				.parse(json)
				.set("$['yearFoaled']", dateStr)
				.json();
		
		System.out.println(date);
		System.out.println(newJson.toPrettyString());
		
		String originalJson = "{\n"
				+ "\"session\":\n"
				+ "    {\n"
				+ "        \"name\":\"JSESSIONID\",\n"
				+ "        \"value\":\"5864FD56A1F84D5B0233E641B5D63B52\"\n"
				+ "    },\n"
				+ "\"loginInfo\":\n"
				+ "    {\n"
				+ "        \"loginCount\":77,\n"
				+ "        \"previousLoginTime\":\"2014-12-02T11:11:58.561+0530\"\n"
				+ "    }\n"
				+ "}";
		
		JsonNode updatedJson = JsonPath.using(configuration)
				.parse(originalJson)
				.set("$.session.name", "MYSESSINID")
				.json();
		
		System.out.println(updatedJson.toString());
	}
}
