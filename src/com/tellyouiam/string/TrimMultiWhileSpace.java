package com.tellyouiam.string;

import org.apache.commons.lang3.StringUtils;

import java.text.Normalizer;

public class TrimMultiWhileSpace {
	public static void main(String[] args) {
		String str = " hello     there   ";
		String str1 = " 3122534; 23569   ";
		System.out.println("x" + StringUtils.normalizeSpace(str) + " y");
		System.out.println(StringUtils.deleteWhitespace(str1));
		System.out.println(StringUtils.deleteWhitespace(str));
		
		final String input = "Tĥïŝ ĩš â fůňķŷ Šťŕĭńġ";
		String normalizer = Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		System.out.println(normalizer);
		String x = null;
		System.out.println(x instanceof String);
	}
}
