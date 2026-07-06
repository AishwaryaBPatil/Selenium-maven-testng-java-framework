package com.seleniumProject.PracticeSeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
 static WebDriver driver;
ChromeOptions options;
public WebDriver getdriver()
{
	return driver;
	}
@BeforeMethod
@Parameters("browser")

public void setup(String browser)
{
	
	if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
//
//		options.addArguments("--headless");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-dev-shm-usage");
//		options.addArguments("--window-size=1920,1080");

		driver = new ChromeDriver(options);
		}
		else
			if(browser.equalsIgnoreCase("firefox"))
			{
			   WebDriverManager.firefoxdriver().setup();
			  FirefoxOptions options = new FirefoxOptions();

				//options.addArguments("--headless");
				//options.addArguments("--no-sandbox");
				//options.addArguments("--disable-dev-shm-usage");
			   
				driver=new FirefoxDriver();
			}
			else
				if(browser.equalsIgnoreCase("Edge"))
				{
					WebDriverManager.edgedriver().setup();
					EdgeOptions options = new EdgeOptions();

					//options.addArguments("--headless");
					//options.addArguments("--no-sandbox");
					//options.addArguments("--disable-dev-shm-usage");
					driver=new EdgeDriver();
				}
				else
				{
					throw new IllegalArgumentException("browser not supported" +browser);
				}
		driver.manage().window().maximize();
		driver.get("https://xqa.io/practice");
	}
	
@AfterMethod
public void teardown()
{
	 if (driver != null) {
	        driver.quit();
	    }
	}
}
