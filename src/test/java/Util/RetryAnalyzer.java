package Util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer  implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int count =0;
	int max=3;
	if(count<max)
	{
		count++;
		return true;
	}
		return false;
	}

}
