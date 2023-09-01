package pararallel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Runner_script 
{
public WebDriver driver;
@Test
@org.testng.annotations.Parameters({"browser"})
public void testng(String browser)
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	if (browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	
	else
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
}

