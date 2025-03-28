package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefinitions {
	
	WebDriver driver;
	
	@Given("user is enentering google.co.in")
	public void user_is_enentering_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions

		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\user\\Downloads\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        driver = new ChromeDriver();
	        
	        //C:\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64
	 
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get("https://www.google.com/");
	 
	}
	@When("user is typing the search term {string}")
	public void user_is_typing_the_search_term(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(string);
		//wait(50000);
	}
	@When("enters the retun key")
	public void enters_the_retun_key() {
	    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	@Then("the user should see the search results")
	public void the_user_should_see_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Flow Success");
		/*
		 * boolean str1 = driver.findElement(By.partialLinkText("Java")).isDisplayed();
		 * if (str1) { System.out.println("Pass"); } else { System.out.println("Fail");
		 * }
		 */
		 
	}



}
