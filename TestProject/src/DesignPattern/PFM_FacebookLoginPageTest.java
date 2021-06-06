package DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//using PFM

public class PFM_FacebookLoginPageTest {

	public WebDriver driver;
	FacebookLoginPage f;
	
	@BeforeMethod //Before Every Test it will Run
	public void init() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void TryToLoginTest() {
		f = new FacebookLoginPage(driver);
        f.loginToHome("username@gmail.com", "123");
		
	}
	
	@AfterMethod
	public void closed() {
		driver.close();
	}
	
}
