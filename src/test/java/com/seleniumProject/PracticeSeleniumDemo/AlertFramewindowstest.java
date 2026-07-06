package com.seleniumProject.PracticeSeleniumDemo;

import java.time.Duration;
import java.util.Set;
import Util.AlertUtil;
import Util.WaithandleUtil;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AlertFramewindowstest extends BaseClass{
	AlertframeWindows alerthandle;
	AlertUtil al;
	//check clicking on new tab button
	@Test
	public void handlenewtab()
	{
		alerthandle=new AlertframeWindows(driver);
		alerthandle.windowhandlebutton();
		alerthandle.newtab();
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("xqa.io/practice"));
	}
	//check window handling
	@Test
	public  void handlewindow()
	{
		alerthandle=new AlertframeWindows(driver);
		alerthandle.windowhandlebutton();
		String parentwindow=driver.getWindowHandle();
		alerthandle.newwindow();
		Set<String> set=driver.getWindowHandles();
		 for(String h:set)
		 {
			if(!parentwindow.equals(h))
			{
				driver.switchTo().window(h);
			}
		 }
		Assert.assertTrue(driver.getTitle().contains("Practice"),"expected new window title is wrong");
		driver.switchTo().window(parentwindow);
	}
	@Test
	public void handleClick_Button_alert() throws InterruptedException
	{
		alerthandle=new AlertframeWindows(driver);
		alerthandle.clickalert();
		alerthandle.clickme();
	    al=new AlertUtil(driver);
		Assert.assertEquals(al.getalertText(), "You clicked a button");
		al.acceptalert();
	}
	@Test
	public void handleconfirmbtn() 
	{
		alerthandle=new AlertframeWindows(driver);
		
		 
		alerthandle.clickalert();
		
		alerthandle.confirmalert();
		 al=new AlertUtil(driver);
		 String text=al.getalertText();
		 System.out.println(text);
		 al.acceptalert();
		  
	}
	@Test
	public void  handlepromtalert()
	{
		alerthandle=new AlertframeWindows(driver);
		alerthandle.clickalert();
		alerthandle.sendpromt();
	    al=new AlertUtil(driver);
		al.sendtext("yes");
		
    }
	
    @Test
    public void handleframes()
    {
    	alerthandle=new AlertframeWindows(driver);
    	alerthandle.frames();
    	WaithandleUtil wait=new WaithandleUtil(driver);
    	alerthandle.getfirstframelocator();
    	driver.switchTo().frame(alerthandle.getfirstframelocator());
    	//System.out.println(alerthandle.getframeheading());
    	alerthandle.getsecondframelocator();
    	
    	
    	System.out.println(alerthandle.getframeheading());
    }
}
