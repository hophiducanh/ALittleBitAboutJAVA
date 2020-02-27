package com.tellyouiam.string.contains;

import java.util.Arrays;
import java.util.List;

public class ContainsIgnoreCase {
	public static void main(String[] args) {
		final List<String> organizationNames = Arrays.asList(
				"Company",
				"Racing",
				"Pty Ltd",
				"Racing Pty Ltd",
				"Breeding",
				"stud",
				"group",
				"bred",
				"breds",
				"tbreds",
				"Thoroughbred",
				"Thoroughbreds",
				"synd",
				"syndicate",
				"syndicates",
				"syndication",
				"syndications",
				"Bloodstock",
				"farm",
				"Horse Transport",
				"Club"
		);
		
		String s = "Bearsley Bloodstock CT: Michael Bearsley";
		
		boolean isOrganizationName = organizationNames.stream().anyMatch(name -> s.toLowerCase().contains(name.toLowerCase()));
		System.out.println(isOrganizationName);
	}
}
