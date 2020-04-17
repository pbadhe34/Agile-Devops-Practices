package com.server.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {	
	
	@Given("^User opens the application$")
	public void openApplication(){
	    System.out.println("User opens the application");
	    
	}	
	@When("^User enters number to get squareroot$")
	public void enterNumberValue() {
		 System.out.println("User enters number value");
	}
	
	@Then("^The matching squareRoot value should be displayed$")
	public void verifySquareRoot()
     {
		 System.out.println("In the verifySquareRoot");
	} 

}
