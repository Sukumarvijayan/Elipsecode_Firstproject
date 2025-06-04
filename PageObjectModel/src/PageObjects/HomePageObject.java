package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	
	//static using, bec its easy to get the webelement in another class without creating objects
		//instead of void, we are using WebElement..return type is WebElement
		//WebDriver Driver need to use...to address WebDriver to use driver.findelement else throw error
		public static WebElement Adminlink(WebDriver Driver) {
			return Driver.findElement(By.xpath("//span[text()='Admin']"));
		}
		
		public static WebElement LeaveBtn(WebDriver Driver) {
			return Driver.findElement(By.xpath("//span[text()='Leave']"));
		}

}
