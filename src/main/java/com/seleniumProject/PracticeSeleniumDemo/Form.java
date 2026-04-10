package com.seleniumProject.PracticeSeleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Report;

public class Form {
	
	WebDriver driver;
//lucide lucide-arrow-right w-4 h-4 text-gray-400 group-hover:text-blue-500 group-hover:translate-x-1 transition-transform

	@FindBy(xpath="/html/body/div[2]/div[1]/div/main/div/div[2]/div[3]/div/a")
	WebElement arrow;
	
	@FindBy(id="firstName")
	WebElement firstNametext;
	
	@FindBy(id="lastName")
	WebElement lastNametext;
	
	@FindBy(id="userEmail")
	WebElement userEmailid;

	@FindBy(xpath="//input[@value='Female']")
	WebElement radio;
	
	@FindBy(id="userNumber")
	WebElement userNumbers;
	
	@FindBy(xpath="//span[contains(text(),'Reading')]")
	WebElement hobbyreding;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement date;
	
	@FindBy(id="uploadPicture")
	WebElement fileupload;
	
	@FindBy(id="state")
	WebElement dropdownbutton;
	
	@FindBy(xpath="//option")
	List<WebElement> statedropdown;
	
	@FindBy(id="city")
	WebElement dropdowncity; 
	
	@FindBy(xpath="//option")
	List<WebElement> citydropdown;
	
	@FindBy(id="currentAddress")
	WebElement currentAddresstextbox;
	
	@FindBy(id="submit")
	WebElement submitbtton;
	
	@FindBy(xpath="//h3[contains(text(),'Thanks for submitting the form')]")
	WebElement thankspopup;
	
	public Form(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickarrow()
	{
		
		arrow.click();
		
	}
	
	//String enteredLastName=lastNametext.getAttribute("value");

	public void formfill()
	{
		String expected="NCR";
		String city="Delhi";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(firstNametext)).sendKeys("aishwarya");
		lastNametext.sendKeys("patil");
		userEmailid.sendKeys("abs@get.com");
		radio.click();
		userNumbers.sendKeys("1234567892");
	    date.sendKeys("20-02-2025");
		hobbyreding.click();
		fileupload.sendKeys("C:\\Users\\AISHWARYA\\Documents\\mysql.sql");
		currentAddresstextbox.sendKeys("abcd");
		dropdownbutton.click();
		
		for(WebElement li:statedropdown)
		{
			if(li.getText().equals(expected))
			{
				li.click();
				Assert.assertEquals(li.getText(), expected);
				
			}
		}
		
		dropdowncity.click();
		for(WebElement citylist:citydropdown)
		{
			if(citylist.getText().equals(city))
			{
				citylist.click();
				break;
			}
		}
		submitbtton.click();
		Assert.assertTrue(thankspopup.isDisplayed(), "Thankspopupvisible");
		
	}
	
	public String getFirstNameValue() {
	    return firstNametext.getAttribute("value");
	}
	public String getLastNameValue() {
	    return firstNametext.getAttribute("value");
	}
	public String getLastValidationmessage() {
	    return lastNametext.getAttribute("validationMessage");
	}
	public String getFirstValidationmessage()
	{
		return firstNametext.getAttribute("validationMessage");
	}
	public String getemailvalidationmessage()
	{
		return userEmailid.getAttribute("validationMessage");
	}
	
	public void invalidinput(String firstN, String lastN, String email)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.visibilityOf(firstNametext));
	    
		firstNametext.clear();
		firstNametext.sendKeys(firstN);
		
		lastNametext.clear();
		lastNametext.sendKeys(lastN);
		
		userEmailid.clear();
		userEmailid.sendKeys(email);
		
		
	}
	
	public void submitbutton()
	{
		submitbtton.click();
	}
}
