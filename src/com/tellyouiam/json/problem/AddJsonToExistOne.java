package com.tellyouiam.json.problem;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.tellyouiam.json.jackson.jsonrootname.PersonalAddress;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class AddJsonToExistOne {
	public static void main(String[] args) throws JsonProcessingException {
		//--------------------------Using Jackson
		ObjectMapper mapper = new ObjectMapper();
		String firstJson = mapper.writeValueAsString(new PersonalAddress("HN", "VN"));
		String secondJson = mapper.writeValueAsString(new PersonalAddress("New York", "USA"));
		TypeReference<Map<String, Object>> type = new TypeReference<Map<String, Object>>() {};
		Map<String, Object> biggerMap = mapper.readValue(firstJson, type);
		Map<String, Object> smallerMap = mapper.readValue(secondJson, type);
		
		Map<String, Object> resultMap = new HashMap<>();
		
		resultMap.put("address", smallerMap);
		resultMap.put("personal", biggerMap);
		
		String outJson = mapper.writeValueAsString(resultMap);
		System.out.println(outJson);
		
		
		//---------------------------Using JSONObject
		
		
		JSONObject jo = new JSONObject();
		jo.put("name", "jon doe");
		jo.put("age", "22");
		jo.put("city", "chicago");
		System.out.println(jo.toString());
	}
}
