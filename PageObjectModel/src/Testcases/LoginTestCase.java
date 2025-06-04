package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.LoginPageObject;

public class LoginTestCase {
    
	@Test
	public void Login() {
		 System.out.println("Hello Suku");
			
			System.setProperty(
		            "webdriver.chrome.driver",
		            "C:\\Users\\user\\Downloads\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		      
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		        
		        //wait
		        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));
		        
		        //classname.elementname..action
		       LoginPageObject.username(driver).sendKeys("Admin");
		       LoginPageObject.Password(driver).sendKeys("admin123");
		       LoginPageObject.Submitbtn(driver).click();
		       
		       driver.close();
	}

}
