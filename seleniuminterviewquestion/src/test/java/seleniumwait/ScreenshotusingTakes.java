package seleniumwait;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotusingTakes {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");


		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		//driver.get("https://www.google.com/");

		driver.get("https://leafground.com/alert.xhtml;jsessionid=node01rjrt4t2fkq558f8t82exrvxt2257888.node0");
		
		//driver.findElement(By.name("j_idt88:j_idt91")).click();
		//Thread.sleep(6000);
		
		//1. Using Selenium's TakesScreenshot 
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		//2. call GetScreenshotAs method and store it in a file 
		File Sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		//3. Create an image file in any location 
		File Destinationfile = new File("E:\\screenshot.png");
		//4. copy the screenshot in destinationFile (image) file, using FileUtils.(commons-io) or we can use Selenium's FileHandler as well to copy the file
        FileHandler.copy(Sourcefile, Destinationfile);
		
		
	}

}
