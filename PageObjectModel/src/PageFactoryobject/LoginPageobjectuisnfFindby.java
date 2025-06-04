package PageFactoryobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageobjectuisnfFindby {
	
	//static using, bec its easy to get the webelement in another class without creating objects
	//we are using WebElement..object type is WebElement
	//use @ findby annotation instead of driver.findelements
	@FindBy (name = "username")
	public static WebElement username;
	@FindBy (name = "password")
	public static WebElement Password;
	@FindBy (xpath =  "//button")
	public static WebElement Submitbtn;

}
