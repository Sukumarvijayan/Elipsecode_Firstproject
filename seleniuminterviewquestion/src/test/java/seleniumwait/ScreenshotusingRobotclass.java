package seleniumwait;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotusingRobotclass {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
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
		
		driver.findElement(By.name("j_idt88:j_idt91")).click();
		Thread.sleep(6000);
		
		// Create a Robot instance
        Robot robot = new Robot();

        // Get the screen size
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

        // Capture the screen
        BufferedImage screenShot = robot.createScreenCapture(screenRect);

        // Define the file path to save the screenshot
        File screenshotFile = new File("E:\\screenshotrobot.png");

        // Save the screenshot as a PNG file
        ImageIO.write(screenShot, "png", screenshotFile);
		
		
	}

}
