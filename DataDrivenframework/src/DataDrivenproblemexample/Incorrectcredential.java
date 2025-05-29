package DataDrivenproblemexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Incorrectcredential {
	
	@Test
	@Parameters({"username","password"})
	public void Incorrectcredentialexample(String uName, String Pw) {
		 System.out.println("Hello Suku");
			
			System.setProperty(
		            "webdriver.chrome.driver",
		            "C:\\Users\\user\\Downloads\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        
		        //C:\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64
		 
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		        
		        //wait
		        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));
		        
		       WebElement username = driver.findElement(By.name("username"));
		       username.sendKeys(uName);
		       WebElement Password = driver.findElement(By.name("password"));
		       Password.sendKeys(Pw);
		       WebElement btnlogin = driver.findElement(By.xpath("//button"));
		       btnlogin.click();
	}

}
