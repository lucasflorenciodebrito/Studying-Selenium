package DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Using POM

public class FacebokLoginTest {
	
	FacebookLoginPage p;
	WebDriver driver;
	
	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	public void TryToLoginTest() {
		p = new FacebookLoginPage(driver);
        p.loginToHome("username@gmail.com", "123");
		
	}
	
	@AfterMethod
	public void closed() {
		driver.close();
	}

}
