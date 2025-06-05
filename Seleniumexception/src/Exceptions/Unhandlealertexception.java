package Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Unhandlealertexception {

public static void main(String[] args) throws InterruptedException {

		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node0148zoqy7sxgg6bfktprt76nsh1783442.node0");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		element.click();
		Thread.sleep(5000);
		element.click();

	}

}
