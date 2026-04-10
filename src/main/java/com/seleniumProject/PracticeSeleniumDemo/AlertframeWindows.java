package com.seleniumProject.PracticeSeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertframeWindows {
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Browser Windows')]")
	WebElement browserwindow;
	
	@FindBy(id="tabButton")
	WebElement newtab;
	
	@FindBy(id="windowButton")
	WebElement window;
	
	
	
	public void windowhandlebutton()
	{
		browserwindow.click();
	}
	public void newtab()
	{
		WebDriverWait web=new WebDriverWait(driver,Duration.ofSeconds(10));
		web.until(ExpectedConditions.visibilityOf(newtab));
		newtab.click();
		
	}
	
	public void newwindow()
	{
		WebDriverWait webb=new WebDriverWait(driver,Duration.ofSeconds(10));
		webb.until(ExpectedConditions.visibilityOf(newtab));
		window.click();
	}
	

	public AlertframeWindows(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
