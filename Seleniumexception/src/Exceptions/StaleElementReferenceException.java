package Exceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StaleElementReferenceException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\user\\Downloads\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        
	        //C:\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64
	 
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        // Launch Website
	        driver.get("http://www.google.com/");
	        
	        //wait
	        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("q")));
	        
	      
	        WebElement element = driver.findElement(By.name("q"));
	        element.sendKeys("Covai"+ Keys.ENTER);
	       // WebElement element = driver.findElement(By.name("q"));
	        element.clear();
	        
	}

}
