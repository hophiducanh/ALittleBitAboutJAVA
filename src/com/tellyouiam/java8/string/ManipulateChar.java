package com.tellyouiam.java8.string;

import me.xdrop.fuzzywuzzy.FuzzySearch;

import java.util.*;

public class ManipulateChar {
	public static void main(String[] args) {
		String address = "P O Box 33701 Takapuna     AUCKLAND   New Zealand;P O Box 33701 Takapuna     AUCKLAND   ;PO Box 33701 Takapuna North Shore City     740  New Zealand;C/- P O box 14-299      PANMURE  AUCKLAND ";
		String address1 = "11 Hunia Street MARTON 4710 NEW ZEALAND;" +
				"411 Whatatutu Rd R D 4 GISBORNE 4072 NEW ZEALAND;" +
				"678 Lavenham Road R D 2 GISBORNE 4072 NEW ZEALAND;" +
				"411 Whatatutu Rd RD 4 Gisborne 4072 New Zealand;" +
				"678 Lavenham Road R D 2 GISBORNE 4072 POVERTY BAY NEW ZEALAND";
	
		String add2 = "11 Hunia Street 4710 MARTON;678 Lavenhan Rd RD 2 GISBORNE 4072;13 Willow Street Mangapapa GISBORNE 4010;678 Lavenhan Rd RD 2 4072 GISBORNE";
		int k = FuzzySearch.tokenSetPartialRatio("louiseblane60", "louiseblane");
		System.out.println("K:" + k);
		
		String address2 = "678 Lavenham Road R D 2 GISBORNE 4072 POVERTY BAY NEW ZEALAND";
		List<String> newAddressList = new ArrayList<>(Arrays.asList(address1.split(";")));
//		Set<String> finalAddressList = new HashSet<>();
		Map<String, String> map = new HashMap<>();
		for (String addr : newAddressList) {
			
			String sortAddr = addr.toLowerCase()
					.replaceAll("[\uFEFF-\uFFFF]", "")
					.chars()
					.sorted()
					.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
					.toString()
					.trim();
			
			for (String addr1 : newAddressList) {
				String sortAddr1 = addr1.toLowerCase()
						.replaceAll("[\uFEFF-\uFFFF]", "")
						.chars()
						.sorted()
//						.filter(e -> e == Character.getNumericValue(Character.MIN_VALUE))
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
						.toString()
						.trim();
				
				if (sortAddr.contains(sortAddr1)) {
					map.put(sortAddr, addr);
				}
			}
		}
//		map.values().forEach(System.out::println);
//		Integer integer = new FuzzyScore(Locale.US).fuzzyScore(address1, address2);
//		678 Lavenham Road R D 2 GISBORNE 4072 NEW ZEALAND;System.out.println(integer);

//		int i = FuzzySearch.tokenSetPartialRatio("678 Lavenham Road R D 2 GISBORNE 4072 NEW ZEALAND",
//				"678 Lavenham Road R D 2 GISBORNE 4072 POVERTY BAY NEW ZEALAND");
		
		int i = FuzzySearch.tokenSetRatio("PO Box 33701 Takapuna North Shore City     740  New Zealand",
				"P O Box 33701 Takapuna     AUCKLAND   ");
//		int j = FuzzySearch.weightedRatio( "678 Lavenham Road R D 2 GISBORNE 4072 POVERTY BAY NEW ZEALAND", "678
//		Lavenham Road R D 2 GISBORNE 4072 NEW ZEALAND");
		System.out.println(i);
//		System.out.println(j);
		Set<String> set = new HashSet<>();
		for (String addr : newAddressList) {
			
			if (set.stream().anyMatch(u -> FuzzySearch.tokenSetRatio(addr, u) >= 95)) {
				continue;
			} else {
				set.add(addr);
			}
			
			for (String addr1 : newAddressList) {
				if (FuzzySearch.tokenSetRatio(addr, addr1) >= 95 && !addr.equals(addr1)) {
					String longer = addr.length() > addr1.length() ? addr : addr1;
					
					String available = set.stream().filter(u -> FuzzySearch.tokenSetRatio(longer, u) >= 95 && u.length() <= longer.length())
							.findAny().orElse(null);
					if (available != null) {
						set.remove(available);
						set.add(longer);
					} else {
						set.add(longer);
					}
				}
				
			}
		}
		System.out.println(set);
	}
	
}
