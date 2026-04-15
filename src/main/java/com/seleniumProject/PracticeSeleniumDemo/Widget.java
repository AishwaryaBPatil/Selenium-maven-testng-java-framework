package com.seleniumProject.PracticeSeleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Widget {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//a[contains(text(),'Accordian')]")
	WebElement accordian;
	
	@FindBy(xpath="//div[@id='section1-heading']/svg[@class='lucide-chevron-down']")
	WebElement firstaccordian;
	
	@FindBy(id="section2-heading")
	WebElement secondaccordian;
	
	@FindBy(id="section3-heading")
	WebElement thirdaccordian;
	
	
	public void clickaccordian() {
		accordian.click();
	}
	
	public void clickfirst()
	{
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(firstaccordian)).click();
		
	}
	
	public void clicksecond()
	{
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(secondaccordian)).click();
	}
	
	public void clickthird()
	{
		thirdaccordian.click();
	}
	
	public WebElement secondgetlocator()
	{
		return secondaccordian;
	}
	
	public WebElement thirdgetlocator()
	{
		return thirdaccordian;
	}
	
	
	
	public Widget(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
