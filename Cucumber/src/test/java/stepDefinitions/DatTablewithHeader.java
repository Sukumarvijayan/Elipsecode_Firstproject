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

public class DatTablewithHeader {
	WebDriver driver;
	
	@Given("Go to login page")
	public void go_to_login_page() {
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
	@When("Enters the below credentials")
	public void enters_the_below_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		//here we are using Map<K,V> (asmaps)....as input behave as key & value
		//convert datatable to map by using "asMpas" & read the value
		//|Admin | Suku ->both string value only used (String.class)
		
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		String username = data.get(0).get("username");
	    String PW = data.get(0).get("Password");
	    driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pw")).sendKeys(PW);
	}
	@When("clicks login button")
	public void clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
	}
	@Then("the user in home page")
	public void the_user_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Navigated to home page");
	}



}
