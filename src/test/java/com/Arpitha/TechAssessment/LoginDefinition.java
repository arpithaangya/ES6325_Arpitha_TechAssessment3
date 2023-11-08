package com.Arpitha.TechAssessment;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginDefinition {
	
	LoginActions act = new LoginActions();
	Utility obj = new Utility();
	LoginLocators loc = new LoginLocators();
	
	@Given("User goes to login page")
	public void user_goes_to_login_page() {
		  System.out.println("url "+obj.strUrl);
		HelperClass.OpenUrl(obj.strUrl);
	}

	@When("User enters email and password")
	public void user_enters_email_and_password() {
	    act.login(obj.strUsername, obj.strPassword);
	}

	@When("Clicks on Login")
	public void clicks_on_login() {
	   act.clicklogin();
	}

	@Then("User will login or fail")
	public void user_will_login_or_fail() {
	   String error = loc.error.getText();
	   Assert.assertTrue(error.contains("Login was unsuccessful. Please correct the errors and try again."));
	}



}
