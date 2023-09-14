package PageObject.TestComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	int count=0;
	int maxTry=1;
	//It is mainly used to rerun the failed test cases. and in the test cases we should mention retryAnalyzer=Retry.class
	@Override
	public boolean retry(ITestResult result) {

		if(count<maxTry)
		{
			count++;
			return true;
		}
		return false;
	}

}
