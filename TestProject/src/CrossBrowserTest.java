import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrossBrowserTest 
{
	public static WebDriver driver;
	@Test
	public void CrossBrowsrTest() throws InterruptedException
	{
		for(int browser=1;browser<3;browser++)
		{
			if(browser==1)
			{
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			    driver = new ChromeDriver();
			}
			else if(browser==2)
			{
				driver= new FirefoxDriver();
			}
			
			driver.get("https://www.google.com");
			String title=driver.getTitle();
			Assert.assertEquals(title, "Google");
			Thread.sleep(2000);//Just for Visibility
			driver.close();
		}
	}
}
