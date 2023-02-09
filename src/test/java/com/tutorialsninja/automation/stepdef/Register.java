package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	
	@Given("^I launch the application$")
	public void i_launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
	    
		
	}

	@And("^Navigate to account registration page$")
	public void navigate_to_account_registration_page(){
	    
	}

	@When("^Provide all below details$")
	public void provide_all_below_details(DataTable arg1) {
	    
		
	}

	@And("^I select the provacy policy$")
	public void i_select_the_provacy_policy(){
	    
		
	}

	@And("^I click on the continue button$")
	public void i_click_on_the_continue_button(){
	    
		
	}

	@Then("^I should see the account successfully created$")
	public void i_should_see_the_account_successfully_created(){
	    
	}

}
