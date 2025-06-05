package Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SessionNotCreatedException {

public static void main(String[] args) throws InterruptedException {

		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		
		//close manually the browser..before its load fully

	}

}
