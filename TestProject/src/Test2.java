import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//clear(), sendKeys(), getAttribute(), click(), getText(), isDisplayed(), isEnabled(), getCssValue()
public class Test2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=pt_BR&display=page");
		//campo nome
		//WebElement text = driver.findElement(By.id("u_0_n_GR"));
		WebElement text = driver.findElement(By.name("firstname"));
		//Digita Meu Nome no campo nome
		text.sendKeys("Meu Nome");
		//Limpa
		text.clear();
		text.sendKeys("Lucas");
		//retorna o atributo de aria-label
		String output = text.getAttribute("aria-label");
		System.out.println("Atrtribute: " + output);
		//Encontra o botão Cadastre-se
		WebElement btn = driver.findElement(By.name("websubmit"));
		//Retorna o texto do botão.
		String btnName = btn.getText();
		System.out.println("Nome do Botão: " + btnName);
		//Clica no Botão
		//btn.click();
		//btn.submit(); funciona apenas se tiver type=submit
		//Verifica se o botão está presente
		System.out.println("Displayed: " + btn.isDisplayed());
		System.out.println("Enabled: " + btn.isEnabled());
		//retorna o valor de css para cor
		String color = btn.getCssValue("color");
		System.out.println("Color: " + color);
		

		
	}

}
