package Util;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {
	
	public static ExtentReports getExtentReports()
	{
	ExtentSparkReporter reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/ExtentReport.html");
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(reporter);
	return extent;
	}

}
