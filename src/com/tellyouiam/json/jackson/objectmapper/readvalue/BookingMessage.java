package com.tellyouiam.json.jackson.objectmapper.readvalue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingMessage {
	
	@JsonProperty("siteId")
	private String siteId;
	@JsonProperty("id")
	private String id;
	@JsonProperty("dateTime")
	private String dateTime;
	@JsonProperty("duration")
	private String duration;
	@JsonProperty("status")
	private String status;
	@JsonProperty("customer")
	private BookingCustomer customer;
	@JsonProperty("employee")
	private BookingEmployee employee;
	@JsonProperty("service")
	private BookingEmployee service;
	
	@Data
	@NoArgsConstructor
	@JsonIgnoreProperties(ignoreUnknown = true)
	private static class BookingCustomer {
		@JsonProperty("email")
		private String email;
		@JsonProperty("firstName")
		private String firstName;
		@JsonProperty("lastName")
		private String lastName;
		@JsonProperty("id")
		private String id;
	}
	
	@Data
	@NoArgsConstructor
	@JsonIgnoreProperties(ignoreUnknown = true)
	private static class BookingEmployee {
		@JsonProperty("id")
		private String id;
		@JsonProperty("name")
		private String name;
	}
	
	@Data
	@NoArgsConstructor
	@JsonIgnoreProperties(ignoreUnknown = true)
	private static class BookingService {
		@JsonProperty("id")
		private String id;
		@JsonProperty("name")
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