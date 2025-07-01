package seleniumwait;

import java.awt.AWTException;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class maximizediffways {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");
    
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com/");
		
		// 1.Maximize the browser
		//driver.get("https://www.google.com/");
		//driver.manage().window().maximize();


		//2.	Use of Dimension (selenium) and window.setSize() method
//		driver.get("https://www.google.com/");
//		Dimension dimension = new Dimension(1366,768);
//		driver.manage().window().setSize(dimension);
		
		//3.
	}

}
