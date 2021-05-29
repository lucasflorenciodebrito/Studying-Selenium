import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Close and quit 
public class Teste4 {

	public static void main(String[] args) {
		//Seleciona o Browser 
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//Url
				driver.get("https://the-internet.herokuapp.com/windows");
				//Encontra o elemento Click Here
				WebElement link = driver.findElement(By.linkText("Click Here"));
				//Fecha a aba
				driver.close();
				//Fecha a Janela
				driver.quit();

	}

}
