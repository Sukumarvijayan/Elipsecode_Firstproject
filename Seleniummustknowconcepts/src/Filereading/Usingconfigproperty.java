package Filereading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Usingconfigproperty {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
        //using FileInputStream to get the config.properties file
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		//create a object for Properties & using load method
		Properties properties = new Properties();
		properties.load(fileInputStream);
		//using getProperty(key) to read the value
		String browser = properties.getProperty("Browser");
		String diverlocation = properties.getProperty("DriverLocation");
		//based on the config file, it will point to particular driver & driver location
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(
					"webdriver.chrome.driver",
					diverlocation);
			driver = new ChromeDriver();
		} else {
			System.setProperty(
					"webdriver.gecko.driver",
					diverlocation);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
	}
}
