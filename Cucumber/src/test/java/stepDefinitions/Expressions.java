package stepDefinitions;

import io.cucumber.java.en.Given;

public class Expressions {

	@Given("I have {int} laptop")
	public void i_have_laptop(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println(int1);
	}
	@Given("I have {double} CGPA")
	public void i_have_cgpa(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println(double1);
	}
	@Given("{string} is elder to {string} and {string}")
	public void is_elder_to_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println(string);
		  System.out.println(string2);
		  System.out.println(string3);
	}



}
