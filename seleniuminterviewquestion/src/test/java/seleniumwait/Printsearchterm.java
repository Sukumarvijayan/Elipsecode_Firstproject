package seleniumwait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printsearchterm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("12 Angry men"+Keys.ENTER);
		Thread.sleep(2000);

		//to print all links in a webpage
//		List <WebElement> searchresult = driver.findElements(By.xpath("//a"));
//
//		for (WebElement webElement : searchresult) {
//			System.out.println(webElement.getAttribute("href"));
//		}

		//to print main links in a webpage based on search reult
		List <WebElement> searchresult1 = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div//cite"));

		for (WebElement webElement : searchresult1) {
			System.out.println(webElement.getText());
		}

	}

}
