package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Beforesuite_Aftersuite {
	WebDriver driver;
	@BeforeSuite
    public void openchromebrowser() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver(); 	
    }
    @Test()
    public void opengoogle() {
    	driver.get("https://www.google.com/");	
    }
    @Test()
    public void opengeeks() {
    	driver.get("https://www.geeksforgeeks.org/");
    }
    @AfterSuite
    public void Closechromebrowser() {
    	driver.quit();	
    }

}
