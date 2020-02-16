package com.tellyouiam.initializationblock.staticblock;

import java.util.HashMap;
import java.util.Map;

public class StaticConstant {
	public static final Map<String, String> initials = new HashMap<String, String>();
	
	static {
		initials.put("AEN", "Alfred E. Newman");
	}
	
	public static void main(String[] args) {
		System.out.println(System.identityHashCode(initials));
		System.out.println(initials.get("AEN"));
	}
}

