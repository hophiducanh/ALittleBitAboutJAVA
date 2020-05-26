package com.tellyouiam.designpattern.decoratorpattern.init;

public interface Report {
	Object[][] getReportData(final String reportId);
	
	String getModifiedFirstColumnData(String data);
}
