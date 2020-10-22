package com.tellyouiam.json.jackson.jsonrootname;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PersonalAddress {
	private String city;
	private String country;
	
	public PersonalAddress() {
	}
	
	public PersonalAddress(String city, String country) {
		this.city = city;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "PersonalAddress{" + "city='" + city + '\'' + ", country='" + country + '\'' + '}';
	}
}
