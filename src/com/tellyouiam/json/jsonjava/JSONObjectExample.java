package com.tellyouiam.json.jsonjava;

import org.json.JSONObject;

public class JSONObjectExample {
	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		jo.put("name", "jon doe");
		jo.put("age", "22");
		jo.put("city", "chicago");
		System.out.println(jo.toString());
		//jo.toString().sout + TAB
		
		System.out.println(jo.get("name"));
//		System.out.println(jo.get("xyz"));
		System.out.println(jo.opt("xyz"));
		jo.put("name", "logbasex");
		jo.put("website", "logbasex.github.io");
		System.out.println(jo);
	}
}
