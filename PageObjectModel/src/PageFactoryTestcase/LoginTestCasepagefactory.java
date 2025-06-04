package PageFactoryTestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageFactoryobject.LoginPageobjectuisnfFindby;
import PageObjects.LoginPageObject;

public class LoginTestCasepagefactory {
	
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
		        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(80));
		        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));
		        
		        //To use Page factory class in order to send the driver to page object class
		        //bec(LoginPageobjectuisnfFindby) in page object class , driver details not present, so need to pass
		        PageFactory.initElements(driver, LoginPageobjectuisnfFindby.class);
		        
		        //classname.elementname..action
		       LoginPageobjectuisnfFindby.username.sendKeys("Admin");
		       LoginPageobjectuisnfFindby.Password.sendKeys("admin123");
		       LoginPageobjectuisnfFindby.Submitbtn.click();
		       
		     //  driver.close();
	}


}
