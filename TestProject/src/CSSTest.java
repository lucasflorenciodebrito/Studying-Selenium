import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Tag[AttributeName=AttributeValue]
//tagName#idattributeValue  
//tagName.classattributeValue


public class CSSTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input[type=text]")).sendKeys("teste@teste.com");
		//usando o id
		//driver.findElement(By.cssSelector("input#email")).sendKeys("teste@teste.com");
		//usando class
		//driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("teste@teste.com");
		//começa com
		//driver.findElement(By.cssSelector("input[aria-label^= Email]")).sendKeys("teste@teste.com");
		//termina com
		//driver.findElement(By.cssSelector("input[aria-label$= telefone]")).sendKeys("teste@teste.com");
		//encontrando um pedaço da string
		driver.findElement(By.cssSelector("input[aria-label*= tel]")).sendKeys("teste@teste.com");
	}

}
