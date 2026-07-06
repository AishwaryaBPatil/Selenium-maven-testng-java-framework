package com.seleniumProject.PracticeSeleniumDemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Element {
	WebDriver driver;
	@FindBy(xpath="//a[normalize-space()='Text Box']")
	WebElement textBox;
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement firstName;
	
	@FindBy(xpath="//a[(normalize-space()='Check Box')]")
	WebElement checkbox;
	
	@FindBy(xpath="//span[@class='text-sm']/preceding-sibling::div")
	List<WebElement> multicheck;
	
	@FindBy(xpath="//a[normalize-space()='Frames']/parent::div")
	WebElement frame;
	
	@FindBy(css="iframe[i='frame1']")
	
	WebElement frame1;
	
	@FindBy(xpath="//div[@role='row']")
	List<WebElement> webtablelist;
	
	@FindBy(xpath="//a[normalize-space()='Web Tables']")
	WebElement webtable;
	
	public void validTextBox()
	{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(textBox)).click();
		firstName.sendKeys("asdisdb");
		
		
		
	}
	public void validcheckBox() throws InterruptedException
	{

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(0));
		wait.until(ExpectedConditions.visibilityOf(checkbox)).click();
		Thread.sleep(2000);
		for(WebElement list:multicheck)
		{
			System.out.println(list.getText());
			list.click();
			Thread.sleep(5000);
		}
		
	}
	
	public void handleFrame() throws InterruptedException
	{
		frame.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(0));
		wait.until(ExpectedConditions.visibilityOf(frame1));
		
		driver.switchTo().frame(frame1);
		String str=frame1.getText();
		System.out.println(str);
		Thread.sleep(5000);
	}
	
	public void handlewebtable()
	{
		webtable.click();
		System.out.println(webtable.getSize());
//		for(WebElement web:webtablelist)
//		{
//			System.out.println(web.getText());
//			
//		}
	}
	
//	public List<String> getAllRows() {
//
//        List<String> rowData = new ArrayList<>();
//
//        for (WebElement row : webtablelist) {
//
//            rowData.add(row.getText());
//
//        }

        //return rowData;
    //}
	Element(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
