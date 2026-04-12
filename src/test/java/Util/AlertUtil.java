package Util;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertUtil {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public AlertUtil(WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public Alert waitForAlert()
	{
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public String getalertText()
	{
		return waitForAlert().getText();
	}
	
	public void acceptalert()
	{
		waitForAlert().accept();
	}
	
	public void dismissalert()
	{
		waitForAlert().dismiss();
	}
	
	public void sendtext(String text)
	{
		Alert alert=waitForAlert();
		alert.sendKeys(text);
		alert.accept();
	}

}
