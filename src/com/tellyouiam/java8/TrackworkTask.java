package com.tellyouiam.java8;

import java.util.Date;

public class TrackworkTask {
	private Integer id;
	private Date createdDate;
	
	public TrackworkTask(){}
	
	public TrackworkTask(Integer id, Date date) {
		this.id = id;
		this.createdDate = date;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
