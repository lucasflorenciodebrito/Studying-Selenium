import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//findeElemnt() e findElements()
public class Test3 {

	public static void main(String[] args) {
		//Seleciona o Browser 
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Url
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
		//Encontra o elemento de linkText
		WebElement forgetlink = driver.findElement(By.linkText("Esqueceu a senha?"));
		forgetlink.click();
		//Encontra múltiplo elementos e retorna uma lista 
		List <WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement l: list)
		{
			System.out.println(l.getAttribute("href"));
		}
		
	}

}
