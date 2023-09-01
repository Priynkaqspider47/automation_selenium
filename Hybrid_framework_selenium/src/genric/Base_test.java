package genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_constraints {

		public WebDriver driver;
		@BeforeMethod
		public void openappln()
		{
			System.setProperty("chrome_key","chrome_value");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("baseurl");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		}
		@AfterMethod
		public void closeappln()
		{
			driver.close();
		}
		

}
