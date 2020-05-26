package com.tellyouiam.designpattern.decoratorpattern.decorator;

public class ClientPopupDecorator extends ColumnDecorator {
	public ClientPopupDecorator(Report report) {
		super(report);
	}
	
	public String getFirstColumnData() {
		return addPopup (super.getFirstColumnData()) ;
	}
	
	private String addPopup(String data){
		return data  + " - client popup - ";
	}
}
