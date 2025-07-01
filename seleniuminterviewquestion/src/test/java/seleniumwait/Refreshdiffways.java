package seleniumwait;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refreshdiffways {

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


		//1.Refresh command
		//		driver.navigate().to("https://www.google.com/");
		//		driver.findElement(By.name("q")).sendKeys("trichy"+Keys.ENTER);
		//		Thread.sleep(5000);
		//		driver.navigate().refresh();

		//2.driver.getcurrenturl 
		//		driver.get("https://www.google.com/");
		//		driver.findElement(By.name("q")).sendKeys("trichy"+Keys.ENTER);
		//		Thread.sleep(5000);
		//		driver.get(driver.getCurrentUrl());

		//3.Robot class

		//		driver.get("https://www.google.com/"); 
		//		driver.findElement(By.name("q")).sendKeys("trichy"+Keys.ENTER); 
		//		Thread.sleep(5000);
		//		Robot robot = new Robot();
		//		robot.keyPress(KeyEvent.VK_F5);
		//		robot.keyRelease(KeyEvent.VK_F5);
				
		//4.f5 via sendkays

		driver.get("https://www.google.com/"); 
		driver.findElement(By.name("q")).sendKeys("trichy"+Keys.ENTER); 
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.F5); 
	}

}
