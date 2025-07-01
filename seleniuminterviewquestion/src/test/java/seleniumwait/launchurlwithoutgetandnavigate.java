package seleniumwait;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchurlwithoutgetandnavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.google.com/";
		
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");


		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.location=\'"+url+"\'");
		
	}

}
