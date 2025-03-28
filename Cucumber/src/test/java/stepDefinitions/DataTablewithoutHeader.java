package stepDefinitions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTablewithoutHeader {
	WebDriver driver;
	
	@Given("You are on the login page")
	public void you_are_on_the_login_page() throws InterruptedException {
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
	
	@When("user enters the below credentials")
	public void user_enters_the_below_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	 
		//convert datatable to list by using "asList" & read the value
		//|Admin | admin123 ->both string value only used (String.class)
				
		/*
		 * List<String> str = dataTable.asList(String.class);
		 * 
		 * String username = str.get(0); String PW = str.get(1);
		 * driver.findElement(By.name("username")).sendKeys(username);
		 * driver.findElement(By.name("pw")).sendKeys(PW);
		 */
		//convert datatable to list by using "asList" & read the value
				//|Admin | admin123 ->both string value only used (String.class)
		
				List<List<String>> data = dataTable.asLists(String.class);
			    String username = data.get(0).get(0);
			    String PW = data.get(0).get(1);
			    driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("pw")).sendKeys(PW);
	}
	
	@When("clicks the login button")
	public void clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
	}
	@Then("the user should see the home page")
	public void the_user_should_see_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Navigated to home page");
	}




}
