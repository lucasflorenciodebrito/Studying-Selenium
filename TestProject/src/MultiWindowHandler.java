import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandler 
{
	@org.testng.annotations.Test
	void testing1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text() = 'Termos']")).click();
		
		String mainWindow=driver.getWindowHandle();//Only one Window, get the cureent window
		Set<String> allWindow = driver.getWindowHandles();//All The Windows
		Iterator<String> it = allWindow.iterator();
		while(it.hasNext())
		{
			String childWindow= (String) it.next();
			if(childWindow != mainWindow)
			{
				driver.switchTo().window(childWindow);
				Thread.sleep(4000);
				WebElement term = driver.findElement(By.linkText("Termos de Serviço"));
				term.click();
				//if you want to come back to the main window  you can use driver.switchTo().window(mainWindow)
			
			}
		}	
	}

}

