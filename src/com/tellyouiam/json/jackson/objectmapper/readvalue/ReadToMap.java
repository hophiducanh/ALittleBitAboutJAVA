package com.tellyouiam.json.jackson.objectmapper.readvalue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class ReadToMap {
	
	public static Map<String, Object> parseJsonToMap(String json) throws IOException {
		Map<String, Object> map = new HashMap<>();
		
		if (StringUtils.isEmpty(json)) return map;
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			map = mapper.readValue(json, new TypeReference<Map<String, Object>>(){});
		} catch (JsonProcessingException e) {
			System.out.println(">>>Convert json to map false ");
		}
		return map;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		String json = "{\"servicefee\":{\"fee\":\"123\"},\"mareownercontract\":{\"contactperson\":null,\"streetaddress\":\"\",\"postaladdress\":null,\"email\":\"jed.adam17@test.gmail.com\",\"telMobile\":null,\"fax\":null,\"mobile\":\"0412922421\",\"fullName\":\"Geoff adams\",\"managingownerid\":438536,\"dob\":null,\"companyname\":null,\"gstregistered\":null,\"owners\":null,\"acn\":null,\"abn\":null,\"directorguaranteea\":null,\"directorguaranteeb\":null,\"directorguaranteec\":null,\"managingowner\":{\"contactperson\":null,\"streetaddress\":\"\",\"postaladdress\":null,\"email\":\"jed.adam17@test.gmail.com\",\"telMobile\":null,\"fax\":null,\"mobile\":\"0412922421\",\"fullName\":\"Geoff Adams\",\"managingOwnerId\":438536,\"dob\":null,\"companyName\":null,\"gstRegistered\":null,\"acn\":null,\"abn\":null,\"directorGuaranteeA\":null,\"directorGuaranteeB\":null,\"directorGuaranteeC\":null,\"owner\":{\"id\":438536},\"name\":\"Geoff adams\"}},\"walkoninfo\":{\"stallion\":{}}}";
		
		Map<String, Object> map = parseJsonToMap(json);
		MapUtils.verbosePrint(System.out, "", map);
		
		map.forEach((key, value) -> System.out.println("Object" + key + " " + value));
		System.out.println(parseJsonToMap(json));
		TypeReference<String> ref = new TypeReference<String>(){};
	}
}
