package seleniumwait;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrylistener implements IRetryAnalyzer{

	int failedcount=0;
	int limit = 2;  //it will rerun the failed TC 2times

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(failedcount<limit) {
			failedcount++;
			return true;  //->it will rerun the failed TC
		}
		return false;
	}

}
