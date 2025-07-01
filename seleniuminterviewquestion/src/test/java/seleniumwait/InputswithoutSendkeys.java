package seleniumwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputswithoutSendkeys {

	public static void main(String[] args) {
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
		driver.get("https://www.google.com/");
		
		//WebElement str = driver.findElement(By.name("q"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].value='trichy'", str);
		executor.executeScript("document.getElementsByName('q')[0].value='trichy'", "");
		
		
		
	}

}
