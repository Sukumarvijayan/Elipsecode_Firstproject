package seleniumwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quitvsclose {

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
		driver.get("https://www.leafground.com/window.xhtml");

		driver.findElement(By.name("j_idt88:j_idt91")).click();
		driver.close();
		//driver.quit();
	}

}
