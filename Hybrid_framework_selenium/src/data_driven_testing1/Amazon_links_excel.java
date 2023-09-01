package data_driven_testing1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_links_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		FileInputStream fis=new FileInputStream("./excel/testdata.xlsx");
       Workbook book = WorkbookFactory.create(fis);
     Sheet sheet = book.getSheet("sheet1");
     java.util.List<WebElement> links = driver.findElements(By.xpath("//a"));
	}

}
