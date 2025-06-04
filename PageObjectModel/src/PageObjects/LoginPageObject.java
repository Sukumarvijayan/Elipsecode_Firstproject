package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	
	//static using, bec its easy to get the webelement in another class without creating objects
	//instead of void, we are using WebElement..return type is WebElement
	//WebDriver Driver need to use...to address WebDriver to use driver.findelement else throw error
	public static WebElement username(WebDriver Driver) {
		return Driver.findElement(By.name("username"));
	}
	
	public static WebElement Password(WebDriver Driver) {
		return Driver.findElement(By.name("password"));
	}
	
	public static WebElement Submitbtn(WebDriver Driver) {
		return Driver.findElement(By.xpath("//button"));
	}
}
