package seleniumwait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paginationexamples {

	public static void main(String[] args) {
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
		driver.get("https://getdataden.com/docs/grid/features/pagination/");

		WebElement nextbtn = driver.findElement(By.xpath("//button[@ref=\"data-den-pagination-next-button\"]"));

		do {
			List<WebElement> str =  driver.findElements(By.xpath("//*[@id='dd-basic-pagination']//div[@colindex=0]"));

			for (WebElement webElement : str) {
				System.out.println(webElement.getText());
			}
			
			if(nextbtn.isEnabled()) {
				nextbtn.click();
			}
			else {
				break;
			}

		} while (true);

	}

}
