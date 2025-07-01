package seleniumwait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintsAllandMainlinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("game of thrones");
		Thread.sleep(2000);
		
		List <WebElement> searchresult = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		
		 for (WebElement webElement : searchresult) {
			System.out.println(webElement.getText());
			String str = webElement.getText();
			if(str.contains("cast")) {
				webElement.click();
				break;
				
			}
		}
		
	}

}
