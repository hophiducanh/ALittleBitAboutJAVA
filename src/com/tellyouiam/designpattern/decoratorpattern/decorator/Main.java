package com.tellyouiam.designpattern.decoratorpattern.decorator;

public class Main {
	public static void main(String[] args)
	{
		
		//ClientPopupDecorator popupDecoratored = new ClientPopupDecorator
		//													(new ClientLinkDecorator(
		//														new ClientReport()));
		//System.out.println(popupDecoratored.getFirstColumnData());
		
		SupportPopupDecorator supportPopupDecoratored = new SupportPopupDecorator
				(new SupportLinkDecorator
						(new SupportReport()));
		System.out.println(supportPopupDecoratored.getFirstColumnData());
	}
}
