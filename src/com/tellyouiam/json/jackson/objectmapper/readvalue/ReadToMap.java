package com.tellyouiam.json.jackson.objectmapper.readvalue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadToMap {
	
	public static Map<String, Object> parseJsonToMap(String json) throws IOException {
		Map<String, Object> map = new HashMap<>();
		
		if (StringUtils.isEmpty(json)) return map;
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			map = mapper.readValue(json, Map.class);
		} catch (JsonProcessingException e) {
			System.out.println(">>>Convert json to map false ");
		}
		return map;
	}
	
	public static void main(String[] args) throws IOException {
		String json = "{\"discountedFee\":5.0,\"show`DiscountFee\":true,\"showContractNote\":true," +
				"\"mareContract\":{\"yearFoaled\":\"2016\",\"lifeNumber\":\"000\",\"absMicrochipNumber\":\"001\"," +
				"\"sire\":\"Zoffany\",\"dam\":\"Coniston Gem\",\"encumbrance\":false,\"encumbranceInfo\":\"\"," +
				"\"stateNumber\":\"001\",\"coveringStallion\":\"Test Stallion\",\"lastServiceResult\":false," +
				"\"lastServiceDate\":1594692000000,\"insurerName\":\"Test Insurer Email\",\"email\":\"minh" +
				".le+12481824192@fruitful.io\",\"fax\":\"\",\"contactPerson\":\"Test Contract Insurer\"," +
				"\"telMobile\":\"0333333333\"},\"agent\":{\"fullName\":\"Test Contract Insurer\"," +
				"\"commissionRate\":\"10.0\",\"gstRegistered\":false,\"abn\":\"702774476200\",\"postalAddress\":\"2402" +
				" Hunter Road, Gundy 2337, Australia\",\"contactPerson\":\"Test Contract Insurer\"," +
				"\"telMobile\":\"0333333333\",\"email\":\"anh.hohihi@fruitful.io\"},\"walkOn\":{\"mareInFoal\":false," +
				"\"maidenFoaler\":true,\"firstSeason\":true,\"stallion\":\"Winx\",\"lsd\":\"\"," +
				"\"mareWalkOnFrom\":\"Victoria\",\"contactNameNumber\":\"Contact Name Number\"}}";
		
		Map map = parseJsonToMap(json);
		System.out.println(map);
		System.out.println(parseJsonToMap(json));
		TypeReference<String> ref = new TypeReference<String>(){};
	}
}
