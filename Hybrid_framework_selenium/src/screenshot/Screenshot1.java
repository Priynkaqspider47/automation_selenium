package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System .setProperty ("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\VINAY\\Desktop\\screenshot_selenium\\screenshot");
		FileHandler.copy(src, dst);

	}


	}


