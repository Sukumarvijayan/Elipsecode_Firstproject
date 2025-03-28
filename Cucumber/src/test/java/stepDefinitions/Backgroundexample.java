package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Backgroundexample {
	
	@Given("Student finish high school")
	public void student_finish_high_school() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Student finish high school");
	}
	@Given("Student finish higher school")
	public void student_finish_higher_school() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Student finisher high school");
	}
	
	@Given("Student applied for medical")
	public void student_applied_for_medical() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Student applied for medical");
	}
	@When("Student clear the exam")
	public void student_clear_the_exam() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Student clear the exam");
	}
	@Then("Student eligible for joining medical")
	public void student_eligible_for_joining_medical() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Student eligible for joining medical");
	}

	@Given("Student applied for engineer")
	public void student_applied_for_engineer() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Student applied for engineer");
	}
	@When("Student clear the cutoff")
	public void student_clear_the_cutoff() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Student clear the cutoff");
	}
	@Then("Student eligible for joining engineer")
	public void student_eligible_for_joining_engineer() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Student eligible for joining engineer");
	}




}
