package Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static String capturescreenshot(WebDriver driver,String screenshotname) throws IOException
	{
		String filePath=System.getProperty("user.dir")+"/screenshots/"+screenshotname+".png";
	
		try {
		TakesScreenshot ts=(TakesScreenshot) driver; 
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(filePath);
		FileUtils.copyFile(src, dest);
		
		}
		catch(Exception e)
		{
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
		return filePath;
		
	}

}
