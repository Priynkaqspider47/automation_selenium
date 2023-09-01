package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc exec started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc successfully executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	  System.out.println("tc failed to execute");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped tc");
	}


}
