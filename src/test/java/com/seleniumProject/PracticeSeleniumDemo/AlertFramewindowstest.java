package com.seleniumProject.PracticeSeleniumDemo;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertFramewindowstest extends BaseClass{
	@Test
	public void handlenewtab()
	{
		AlertframeWindows tab=new AlertframeWindows(driver);
		tab.windowhandlebutton();
		tab.newtab();
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("https://xqa.io/practice"));
	}
	@Test
	public  void handlewindow()
	{
		AlertframeWindows windows=new AlertframeWindows(driver);
		windows.windowhandlebutton();
		String parentwindow=driver.getWindowHandle();
	    windows.newwindow();
		Set<String> set=driver.getWindowHandles();
		 for(String h:set)
		 {
			if(!parentwindow.equals(set))
			{
				driver.switchTo().window(h);
			}
		 }
		// System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Practice"),"expected new window title is wrong");
		driver.switchTo().defaultContent();
		
		
	}

}
