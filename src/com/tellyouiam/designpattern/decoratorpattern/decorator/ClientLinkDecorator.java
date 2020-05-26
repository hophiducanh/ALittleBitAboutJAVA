package com.tellyouiam.designpattern.decoratorpattern.decorator;

public class ClientLinkDecorator extends ColumnDecorator{
	public ClientLinkDecorator(Report report) {
		super(report);
	}
	
	public String getFirstColumnData() {
		return addMoreInfo (super.getFirstColumnData()) ;
	}
	
	private String addMoreInfo(String data){
		return data  + " - client link - ";
	}
}
