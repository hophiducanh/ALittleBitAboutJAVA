package com.tellyouiam.designpattern.decoratorpattern.decorator;

public abstract class ColumnDecorator implements Report {
	private final Report decoratedReport;
	
	public ColumnDecorator(Report report) {
		this.decoratedReport = report;
	}
	
	public String getFirstColumnData() {
		return decoratedReport.getFirstColumnData();
	}
	
	@Override
	public Object[][] getReportData(String reportId) {
		return decoratedReport.getReportData(reportId);
	}
}
