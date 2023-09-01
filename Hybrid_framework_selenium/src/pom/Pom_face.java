package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genric.Base_page;

public class Pom_face extends Base_page {
	 //declaration
		@FindBy(id="email")
		private WebElement email;
		@FindBy(name="pass")
		private WebElement pass;
		@FindBy(name="login")
		private WebElement loginbtn;
		
		//Initialization
		public Pom_face(WebDriver driver)
		{
			super(driver);
		}
		
		//utilization
		
		public void emailid(String em)
		{
			email.sendKeys(em);
		}
		
		public void password (String pw)
		{
			pass.sendKeys(pw);
		}
		
		public void clicklogin ()
		{
			loginbtn.click();
		}
}
