package Testcases;

import PageObjects.HomePageObject;
import PageObjects.LoginPageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class VerifyHomePage {
	  WebDriver driver;
	  
	@Test (priority = 0)
	public void Login() {
		 System.out.println("Hello Suku");
			
			System.setProperty(
		            "webdriver.chrome.driver",
		            "C:\\Users\\user\\Downloads\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        driver = new ChromeDriver();
		      
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
	}

	@Test (priority = 1)
	public void verifyHome() {
		// Instantiate a ChromeDriver class.

        
        //wait
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Admin']")));
        
        boolean admin = HomePageObject.Adminlink(driver).isDisplayed();
        boolean logout = HomePageObject.LeaveBtn(driver).isDisplayed();
        
        if (admin == true & logout == true) {
        	System.out.println("Adminlink & logoutbtn present in the home page");
        } else {
        	System.out.println("Adminlink & logoutbtn not present in the home page");
        }
	}

}
