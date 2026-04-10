package com.seleniumProject.PracticeSeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
static WebDriver driver;

public WebDriver getdriver()
{
	return driver;
	}
@BeforeSuite
@Parameters("browser")

public void setup(String browser)
{
	
	if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else
			if(browser.equalsIgnoreCase("firefox"))
			{
			   WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else
				if(browser.equalsIgnoreCase("Edge"))
				{
					WebDriverManager.edgedriver().setup();
					driver=new EdgeDriver();
				}
				else
				{
					throw new IllegalArgumentException("browser not supported" +browser);
				}
		driver.manage().window().maximize();
		driver.get("https://xqa.io/practice");
	}
	
@AfterSuite
public void teardown()
{
	driver.quit();
	}
}
