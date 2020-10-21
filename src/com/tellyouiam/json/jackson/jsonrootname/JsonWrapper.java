package com.tellyouiam.json.jackson.jsonrootname;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class JsonWrapper {
	@JsonProperty("person")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private PersonEntity personEntity;
	
	private PersonalAddress address;
	
	public PersonalAddress getAddress() {
		return address;
	}
	
	public void setAddress(PersonalAddress address) {
		this.address = address;
	}
	
	public PersonEntity getPersonEntity() {
		return personEntity;
	}
	
	public void setPersonEntity(PersonEntity personEntity) {
		this.personEntity = personEntity;
	}
}
