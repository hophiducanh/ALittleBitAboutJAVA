package com.tellyouiam.regex.matcher;

import com.tellyouiam.java8.comparator.Developer;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : Ho Anh
 * @since : 23/09/2019, Mon
 **/
public class MatcherTest {
	public static final String DATE_TIME_FORMAT_IN_CSV = "dd/MM/yyyy h:m:s a";

	public static String extract(String source, String regex) {
		String result = null;
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(source);
		if (m.find()) {
			result = m.group(1);
			result = result.replace("\u00a0", " ").trim();
		}
		return result;
	}

	public static String csvValue(Object value) {
		if (value == null) {
			return "";
		} else if (value instanceof String) {
			return String.format("\"%s\"", ((String) value).replace('"', '\'').replace("\ufe0f", ""));
		} else if (value instanceof Date) {
			return new SimpleDateFormat(DATE_TIME_FORMAT_IN_CSV).format((Date) value).toString();
		}

		return value.toString();
	}
	public static void main(String[] args) {

		String aaa = String.format("%s,%s,%s,%s,%s,%s,%s", "", "", "B", "C", "D", "E", "F");
		System.out.println(aaa);

		System.out.println("************************************************************************");
		List<String> t = Arrays.asList("Duc", "Anh");
		System.out.println(t.iterator().next());
		Set<String> tt = new HashSet<>(t);
		System.out.println(tt.size());
		System.out.println(tt.size() == 1 ? tt.iterator().next() : "SIZE IS NULL");
		System.out.println("***********************************************************************");

		String mail = "1+fake@gmail.com";
		mail = mail.replace(extract(mail, "(\\+fake.*)@"), "");
		String datePart = extract("08/05/1997566", "^(\\d{1,2}/\\d{1,2}/\\d{1,4})\\s*\\d*.*$");
		String datePart1 = extract("08/99/1997566", "^(\\d{1,2}/\\d{1,2}/\\d{1,4})\\s*\\d*.*$");
		System.out.println(datePart);
		System.out.println(datePart1);
//		System.out.println(mail);
//
//		System.out.println(csvValue("PrismData:"));

		String text    =
			"John writes about this, and John writes about that," +
				" and John writes about everything. "
			;

		String patternString1 = "((John) (writes))";

		Pattern pattern = Pattern.compile(patternString1);
		Matcher matcher = pattern.matcher(text);
		System.out.println(matcher);

		while(matcher.find()) {
			System.out.println("found: " + matcher.group(1));
			System.out.println("found: " + matcher.group(2));
			System.out.println("found: " + matcher.group(3));
		}

		String a = "19";
		int x = Integer.parseInt(a);;
		String rank = "duc anh duc anh ";
		rank = rank.replace("\u00a0", "");
//		System.out.println(rank);

		Map<String, List<Developer>> mapAllOwners = new HashMap<>();
		if (mapAllOwners.size() == 0) {
//			System.out.println("null");
		}
	}
}
