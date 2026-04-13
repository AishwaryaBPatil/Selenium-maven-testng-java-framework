package com.seleniumProject.PracticeSeleniumDemo;

import org.testng.annotations.Test;

public class Widgettest extends BaseClass{
	Widget widget;
	@Test
	public void handleaccordian()
	{
		widget=new Widget(driver);
		widget.clickaccordian();
		widget.clickfirst();
	}

}
