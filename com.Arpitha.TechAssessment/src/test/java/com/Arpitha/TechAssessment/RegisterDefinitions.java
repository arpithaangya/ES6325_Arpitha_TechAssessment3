package com.Arpitha.TechAssessment;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegisterDefinitions {
	 WebDriver driver;
	 
		@Before
		public void beforemethod() {
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
		}
	
		@Given("Open Url of OpenCart")
		public void open_url_of_open_cart() {
		   driver.get("https://demowebshop.tricentis.com/register");
		}

		@When("User selects Gender and enters FirstName")
		public void user_selects_gender_and_enters_first_name(io.cucumber.datatable.DataTable dataTable) {
			  List<Map<String,String>> firsttwo = dataTable.asMaps(String.class, String.class);
			    for(Map<String,String> form : firsttwo) {
			    	String gender = form.get("gender");
			    	System.out.println("gender:" +gender);
			    	
			    	driver.findElement(By.id("gender-female")).click();;
			    	
			    	String firstname = form.get("firstname");
			    	System.out.println("firstname:" +firstname);
			    	
			    	driver.findElement(By.id("FirstName")).sendKeys(firstname);
			    	
			    	
			    }
		}

		@When("User enters Lastname , Email")
		public void user_enters_lastname_email(io.cucumber.datatable.DataTable dataTable) {
		   
			List<Map<String,String>> second = dataTable.asMaps(String.class, String.class);
		    for(Map<String,String> form : second) {
		    	String lastname = form.get("lastname");
		    	System.out.println("lastname:" +lastname);
		    	
		    	driver.findElement(By.id("LastName")).sendKeys(lastname);
		    	
		    	String Email = form.get("Email");
		    	System.out.println("Email:" +Email);
		    	
		    	driver.findElement(By.id("Email")).sendKeys(Email);
		    	
		    	
		    }
		}

		@When("User enters Pass and Confirm")
		public void user_enters_pass_and_confirm(io.cucumber.datatable.DataTable dataTable) {
		   
			List<Map<String,String>> third = dataTable.asMaps(String.class, String.class);
		    for(Map<String,String> form : third) {
		    	String Pass = form.get("Pass");
		    	System.out.println("Pass:" +Pass);
		    	
		    	driver.findElement(By.id("Password")).sendKeys(Pass);
		    	
		    	String confirm = form.get("confirm");
		    	System.out.println("confirm:" +confirm);
		    	
		    	driver.findElement(By.id("ConfirmPassword")).sendKeys(confirm);
		    	
		    	
		    }
		}

		@When("Click on Register")
		public void click_on_register() {
		   driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		}

		@Then("User gets registered")
		public void user_gets_registered() {
		   String actual = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
		   
		   Assert.assertEquals(actual, "Your registration completed");
		}

	
}
