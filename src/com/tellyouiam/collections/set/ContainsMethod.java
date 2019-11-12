package com.tellyouiam.collections.set;

import java.util.HashSet;

public class ContainsMethod {
	public static final Role ROLE_ADMIN = new Role(1, "ROLE_ADMIN");
	
	public static final Role ROLE_TRAINER = new Role(2, "ROLE_TRAINER");
	
	public static final Role ROLE_STAFF = new Role(3, "ROLE_STAFF");
	
	public static final Role ROLE_OWNER = new Role(4, "ROLE_OWNER");
	
	public static final Role ROLE_AUTHORITY = new Role(5, "ROLE_AUTHORITY");
	
	public static final Role ROLE_UNVERIFIED_TRAINER = new Role(6, "ROLE_UNVERIFIED_TRAINER");
	
	public static final Role ROLE_UNVERIFIED_STAFF = new Role(7, "ROLE_UNVERIFIED_STAFF");
	
	public static final Role ROLE_UNVERIFIED_OWNER = new Role(8, "ROLE_UNVERIFIED_OWNER");
	
	public static final Role ROLE_WEB = new Role(9, "ROLE_WEB");
	
	public static final Role ROLE_SYNDICATOR = new Role(10, "ROLE_SYNDICATOR");
	
	public static final Role ROLE_SYNDICATOR_STAFF = new Role(11, "ROLE_SYNDICATOR_STAFF");
	
	public static void main(String[] args) {
		HashSet roles = new HashSet<Role>() {
			{
				add(new Role(1, "ROLE_ADMIN"));
				add(new Role(2, "ROLE_TRAINER"));
			}
		};
		
		if (roles.contains(ROLE_ADMIN)) {
			System.out.println("YES");
		}
	}
}
