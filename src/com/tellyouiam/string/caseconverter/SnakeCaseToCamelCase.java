package com.tellyouiam.string.caseconverter;

import org.apache.commons.text.CaseUtils;

/**
 * TODO: https://stackoverflow.com/questions/34228942/from-snake-case-to-camelcase-in-java/34230342
 * */
public class SnakeCaseToCamelCase {
	public static void main(String[] args) {
		String result = CaseUtils.toCamelCase("pham_dat", false, new char[]{'_'});
		System.out.println("result = " + result);
	}
}
