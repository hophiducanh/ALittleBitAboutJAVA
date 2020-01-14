package com.tellyouiam.collections.map;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DoubleBracketInitialization {
	public static void main(String[] args) {
		
		Map source = new HashMap() {{
			put("firstName", "John");
			put("lastName", "Smith");
			put("organizations", new HashMap() {{
				put("0", new HashMap() {{
					put("id", "1234");
				}});
				put("abc", new HashMap() {{
					put("id", "5678");
				}});
			}});
		}};
		System.out.println(source);
		System.out.println(Double.NaN);
		System.out.println(new Date());
	}
}
