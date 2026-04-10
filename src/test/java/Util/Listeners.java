package Util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.seleniumProject.PracticeSeleniumDemo.BaseClass;

public class Listeners implements ITestListener {
	ExtentReports extent=Extentreport.getExtentReports();
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result)
	{
		test=extent.createTest(result.getMethod().getMethodName());
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS,"Test Passed");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		Object testClass = result.getInstance();
        WebDriver driver = ((BaseClass) testClass).getdriver();
        test.fail(result.getThrowable());
        
        try {
        	String path=Screenshot.capturescreenshot(driver, result.getMethod().getMethodName());
        	test.addScreenCaptureFromPath(path, result.getMethod().getMethodName());//attach screenshot to report 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onFinish(org.testng.ITestContext context) {
        extent.flush();
    }

}
