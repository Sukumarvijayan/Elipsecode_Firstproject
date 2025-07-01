package seleniumwait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkallcheckboxes {

	public static void main(String[] args) {
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		List<WebElement> str = driver.findElements(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		 
		for (WebElement webElement : str) {
			if (webElement.isEnabled()) {
				webElement.click();
			}
		}
			
		

	}

}
