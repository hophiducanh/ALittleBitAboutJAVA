package com.tellyouiam.java8inaction.anymatch;

import java.util.Date;

/**
 * @author : Ho Anh
 * @since : 05/09/2019, Thu
 **/
public class MergedTrainerHorse {
	private Integer id;
	private String name;

	public MergedTrainerHorse(){}
	public MergedTrainerHorse(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Id: " + id +"," +" name: " + name;
	}
}