import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Locating WebELement by TagName, id, name, class name, linkText, partialLinkText
//xpath
//tagname[@AttributeName=’AttributeValue’]
//input[@id=’username’]
//We can use more than one attribute in an ‘xpath’ expression:
//input[@id=’username’] [@type =’text’] 
//input[@id=’username’ and @type =’text’] 
//input[@id=’username’ or @type =’text’]
////tagname[text()=’textValue’]

public class BasicLocatorTest {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Lucas/OneDrive/%C3%81rea%20de%20Trabalho/basichtml.html");
		//encontra o elemento que tem a tag <a>
		//WebElement link = driver.findElement(By.tagName("a"));
		//encontra o elemento com id=fb
		//WebElement link = driver.findElement(By.id("fb"));
		//encontra o elemento pelo name
		//WebElement link = driver.findElement(By.name("facebook"));
		//encontra o elemento pelo nome da class
		//WebElement link = driver.findElement(By.className("fblogin"));
		//encontra o elemento pelo texto do link
		//WebElement link = driver.findElement(By.linkText("Click here to login Facebook"));
		//encontra o elemento por parte do texto do link
		//WebElement link = driver.findElement(By.partialLinkText("Click here"));
		//usando absolute xpath
		//WebElement username = driver.findElement(By.xpath("/html/body/input[1]"));
		//username.sendKeys("Username");
		//WebElement password = driver.findElement(By.xpath("/html/body/input[2]"));
		//password.sendKeys("password");
		//usando relative xpath
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Username");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("password");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.xpath("//a[text()=' Click here to login Facebook ']"));
		link.click();
	}

}
