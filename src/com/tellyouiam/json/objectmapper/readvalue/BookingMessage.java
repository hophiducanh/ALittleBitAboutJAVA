package com.tellyouiam.json.objectmapper.readvalue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookingMessage {
	
	@JsonProperty("siteId")
	private String siteId;
	private String id;
	private String dateTime;
	private String duration;
	private String status;
	private BookingCustomer customer;
	private BookingEmployee employee;
	private BookingEmployee service;
	
	@Data
	@NoArgsConstructor
	@JsonIgnoreProperties(ignoreUnknown = true)
	private static class BookingCustomer {
		private String email;
		private String firstName;
		private String lastName;
		private String id;
	}
	
	@Data
	@NoArgsConstructor
	@JsonIgnoreProperties(ignoreUnknown = true)
	private static class BookingEmployee {
		private String id;
		private String name;
	}
	
	@Data
	@NoArgsConstructor
	@JsonIgnoreProperties(ignoreUnknown = true)
	private static class BookingService {
		private String id;
		private String name;
	}
	
	@Override
	public String toString() {
		return "BookingMessage{" +
				"siteId='" + siteId + '\'' +
				", id='" + id + '\'' +
				", dateTime='" + dateTime + '\'' +
				", duration='" + duration + '\'' +
				", status='" + status + '\'' +
				", customer=" + customer +
				", employee=" + employee +
				", service=" + service +
				'}';
	}
}