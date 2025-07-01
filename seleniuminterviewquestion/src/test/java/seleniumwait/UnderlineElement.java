package seleniumwait;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnderlineElement {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("https://www.google.com/");

		WebElement linkstr = driver.findElement(By.xpath("//a[text()='தமிழ்']"));
		String beforehower = linkstr.getCssValue("text-decoration");
		System.out.println("Before hower: "+beforehower);

		Actions action = new Actions(driver);
		action.moveToElement(linkstr);
		action.perform();

		String Afterhower = linkstr.getCssValue("text-decoration");
		System.out.println("After hower: "+Afterhower);

	}


}
