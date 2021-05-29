import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlinepngtools.com/convert-jpg-to-png");	
		//Clicking the place want to upload a file
        driver.findElement(By.xpath("(//canvas[@class='preview'])[1]")).click();
        Thread.sleep(4000);
        //Store the location of the file in clipboard 
        StringSelection sel=new StringSelection("C:\\Users\\Lucas\\OneDrive\\Imagens\\figura1.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		//Now use Robot class throws AWT Exception	
        Robot robot = new Robot();  
		robot.keyPress(KeyEvent.VK_CONTROL);//Ctrl
		robot.keyPress(KeyEvent.VK_V);//v	So its Ctrl+v
		robot.keyPress(KeyEvent.VK_ENTER);//Enter
        System.out.println("Its........Done");
    // press enter key of keyboard to perform above selected action      


	}

}
