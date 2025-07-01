package seleniumwait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaystoSearchinGoogle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Trichy"+Keys.ENTER);
		
		//driver.findElement(By.name("q")).sendKeys("Trichy \n");
		
		//driver.findElement(By.name("q")).sendKeys("Trichy");
		//driver.findElement(By.name("q")).submit();
		
		driver.findElement(By.name("q")).sendKeys("Trichy");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
}
	
}
