package DesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Using POM

public class FacebookLoginPage {
	WebDriver driver;
	
	
	public FacebookLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By username =  By.id("email");
	By password = By.id("pass");
	By loginButton = By.linkText("Entrar");
	
	public void loginToHome (String user, String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
	
	
}
