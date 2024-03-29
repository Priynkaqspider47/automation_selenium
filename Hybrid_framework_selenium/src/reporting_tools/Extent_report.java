package reporting_tools;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_report {
	@Test
	public void report()
	{
		//step1
		ExtentReports report=new ExtentReports("./reports/r.html",false);
		//step2
		ExtentTest log1 = report.startTest("tc1");
		//step3
		log1.log(LogStatus.PASS, "tc passed");
		log1.log(LogStatus.FAIL, "tc failed");
		log1.log(LogStatus.SKIP, "tc skipped");
		report.endTest(log1);
		report.flush();
	}

}
