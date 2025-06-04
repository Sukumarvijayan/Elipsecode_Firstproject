package PagefactorywithoutFindbyannotation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageobjectwithoutFindbyanotation {
	
    //here we are not using find element or findby annotation
	//instead of we are checking the webelement id or name in HTML page & including direct webelement id or name
	//with help of pagefactory.initElements, will check the direct ID or name first in html page
	public static WebElement username;

	public static WebElement password;

	@FindBy (xpath =  "//button")
	public static WebElement Submitbtn;

}
