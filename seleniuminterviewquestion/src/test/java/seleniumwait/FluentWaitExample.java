package seleniumwait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {
    public static void main(String[] args)
    {
        // Set the path to ChromeDriver
    	System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://www.google.com/");

        // Define Fluent Wait with a maximum timeout of 30
        // seconds and polling every 2 seconds
        Wait<WebDriver> wait
            = new FluentWait<>(driver)
                  .withTimeout(Duration.ofSeconds(40))
                  .pollingEvery(Duration.ofSeconds(3))
                  .ignoring(TimeoutException.class);

        try {
            // Wait until the element with ID "my_element"
            // is clickable
            WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(
                    By.name("q")));

            // Once the element is clickable, perform
            // desired actions
            element.click();
            System.out.println(
                "Element clicked successfully!");
        }
        catch (TimeoutException e) {
            System.out.println(
                "Timed out waiting for element to be clickable..");
        }
        
    }
}