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
	
	@FindBy(id="confirmResult")
	WebElement confirmbn;
	
	
	@FindBy(id="promtButton")
	WebElement promtbtn;
	
	
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
		
	public void clickalert()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].click();", alert);
		
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
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].click();", confirmbn);
		//WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		//w.until(ExpectedConditions.elementToBeClickable()).click();
	}
		
	public void sendpromt()
	{
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(promtbtn)).click();
		
	}
    public AlertframeWindows(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
    

}
