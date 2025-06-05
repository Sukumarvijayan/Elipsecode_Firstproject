package Exceptions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class NoSuchSessionException {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		driver.quit();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Covai"+ Keys.ENTER);
	}

}
