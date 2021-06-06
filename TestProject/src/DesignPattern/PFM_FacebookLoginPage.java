package DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Using PFM

public class PFM_FacebookLoginPage {
	
	
	//Finding all the weblements
	@FindBy(id = "email")
	private WebElement UserNameText;
	
	@FindBy(id = "pass")
	private WebElement PasswordText;
	
	@FindBy(id = "loginbutton")
	private WebElement LoginButton;
	
	
	//Initialising all the webelements
	public PFM_FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Peform All the Action by creating separte public setter method
	public void loginToHome(String UN, String Pass){
		UserNameText.sendKeys(UN);
		PasswordText.sendKeys(Pass);
		LoginButton.click();
	}
	
	
	

}
