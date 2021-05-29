import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//isSelected(), getSize(), getLocation()
public class WBTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=pt_BR&display=page");
		//encontra o elemento do radiobutton para sexo
		WebElement rb = driver.findElement(By.name("sex"));
		//verifica se está selecionado
		System.out.println("Selected: " + rb.isSelected());
		//encontra o botão Cadastre-se
		WebElement btn = driver.findElement(By.name("websubmit"));
		//retorna o tamanho do botão
		Dimension d = btn.getSize();
		System.out.println("Height: " + d.getHeight());
		System.out.println("Width: " + d.getWidth());
		//retorna a localização
		Point p = btn.getLocation();
		System.out.println("x: " + p.x);
		System.out.println("y: " + p.y);
		
		
	}

}
