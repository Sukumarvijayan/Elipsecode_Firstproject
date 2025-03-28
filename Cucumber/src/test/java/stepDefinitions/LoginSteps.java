package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		// Instantiate a ChromeDriver class.
		driver = new ChromeDriver();

		// C:\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		driver.get("https://login.salesforce.com/");
		Thread.sleep(5000);
	}

	@When("user enters the valid username & Password")
	public void user_enters_the_valid_username_password() {
		// Write code here that turns the phrase above into concrete actions
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("pw")).sendKeys("admin123");

	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
	}

	
	  @Then("the user should be navigated to home page") public void
	  the_user_should_be_navigated_to_home_page() { // Write code here that turns
	  //the phrase above into concrete actions
	  System.out.println("Navigated to home page"); }
	  
	  
	  
	 
}
