package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatablewithexamples {
	
	WebDriver driver;
	
	@Given("Proceed to login page")
	public void proceed_to_login_page() {
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
	        driver.get("https://login.salesforce.com/");
	      // Thread.sleep(5000);
	 
	}
	@When("user enters {string} and password {string}")
	public void user_enters_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("username")).sendKeys(string);
			driver.findElement(By.name("pw")).sendKeys(string2);
	}

    @When("clicks login buttonss")
    public void clicks_login_buttonss() {
    // Write code here that turns the phrase above into concrete actions
    	driver.findElement(By.name("Login")).click();
     } 
    
    
	@Then("User in home page")
	public void user_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Navigated to home page");
	}




}
