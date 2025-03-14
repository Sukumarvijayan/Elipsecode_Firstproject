package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallelexample {

	 @Test()
	  public void opengoogle() {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver(); 	
	    	driver.get("https://www.google.com/");
	    	driver.quit();
	    }
	  @Test()
	   public void opengeeks() {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
	    	driver.get("https://www.geeksforgeeks.org/");
	    	driver.quit();
	    }

}
