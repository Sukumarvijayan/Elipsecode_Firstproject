package seleniumwait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollawebpage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");


		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		driver.get("https://echoecho.com/htmlforms11.htm");

		//		1. How to scroll down to a specific position? 
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,450)", "");
		Thread.sleep(3000);
		
		//				2. How to scroll up to a specific position? 
		executor.executeScript("window.scroll(0,-450)", "");
		Thread.sleep(3000);
		
		//				3. How to scroll to the bottom of the page? 
		executor.executeScript("window.scroll(0,document.body.scrollHeight)", "");
		Thread.sleep(3000);
		
		//				4. How to scroll to the top of the page? 
		executor.executeScript("window.scroll(0,0)", "");
		Thread.sleep(3000);
		
		//				5. How to scroll to a position where a specific web element is present? 
		
		WebElement str = driver.findElement(By.xpath("//*[text()='online tool']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", str);
		
		//				6. How to use the Robot class to scroll a web page?

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);

	}

}
