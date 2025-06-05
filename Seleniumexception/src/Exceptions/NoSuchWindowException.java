package Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NoSuchWindowException {

public static void main(String[] args) throws InterruptedException {

		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		//just provided window name as “Suku”
		driver.switchTo().window("Suku");

	}

}
