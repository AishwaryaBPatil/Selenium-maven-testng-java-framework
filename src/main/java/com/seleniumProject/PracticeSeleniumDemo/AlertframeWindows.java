package com.seleniumProject.PracticeSeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(xpath="//a[contains(text(),'Alerts')]")
	WebElement alert;
	
	@FindBy(id="alertButton")
	WebElement clickmebuttonfirst;
	
	@FindBy(id="timerAlertButton")
	WebElement timealertbtn;
	
	@FindBy(id="confirmButton")
	WebElement confirmbn;
	
	
	@FindBy(id="promtButton")
	WebElement promtbtn;
	
	@FindBy(xpath="//a[contains(text(),'Frames')]")
	WebElement frame;
	
	@FindBy(id="frame1")
	WebElement frameone;
	
	@FindBy(id="frame2")
	WebElement frametwo;
	
	@FindBy(id="sampleHeading")
	WebElement frameheading;
	
	public void windowhandlebutton()
		{
			driver.get("https://xqa.io/practice/browser-windows");
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
		
	public void clickalert()
	{
		driver.get("https://xqa.io/practice/alerts");
	}
	//Click Button to see alert
	public void clickme()
	{
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		w.until(ExpectedConditions.elementToBeClickable(clickmebuttonfirst)).click();
		
		
	}
	public void timealert()
	{
		timealertbtn.click();
	}
	public void confirmalert()
	{
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement btn=w.until(ExpectedConditions.elementToBeClickable(confirmbn));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
	}
		
	public void sendpromt()
	{
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(promtbtn)).click();
		
	}
	
	public void frames()
	{
		driver.get("https://xqa.io/practice/frames");
	}
	
	public WebElement getfirstframelocator()
	{
	return frameone;	
	}
	public String getframeheading()
	{
		return frameheading.getText();
	}
	public WebElement getsecondframelocator()
	{
	return frametwo;	
	}
	
    public AlertframeWindows(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
    

}
