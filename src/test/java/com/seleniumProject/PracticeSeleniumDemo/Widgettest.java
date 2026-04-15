package com.seleniumProject.PracticeSeleniumDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Widgettest extends BaseClass{
	Widget widget;
	@Test
	public void handleaccordian()
	{
		String str="Where does it come from?";
		String thirdstring="Why do we use it?";
		widget=new Widget(driver);
		widget.clickaccordian();
		widget.clicksecond();
		String strr=widget.secondgetlocator().getText();
		String thirdstring1=widget.thirdgetlocator().getText();
	     Assert.assertEquals(str, strr,"secondAssertion not working");
	     Assert.assertEquals(thirdstring, thirdstring1,"thirdAssertion not working");
	}
	

}
