package Util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaithandleUtil {

	 WebDriver driver;
	 WebDriverWait wait;
	public WaithandleUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement elementtobeclickable(WebElement locator)
	{
		
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	public WebDriver frametobeavailable(By locator)
	{
		
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		
	}
	
	
}
