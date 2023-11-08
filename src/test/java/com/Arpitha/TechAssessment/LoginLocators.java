package com.Arpitha.TechAssessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	@FindBy(name="Email") WebElement emailLog;
	@FindBy(name="Password") WebElement passwordLog;
	@FindBy(xpath="//div[2]/div[2]/form/div[5]/input") WebElement loginBtn;
	
	@FindBy(xpath="//div[@class=\"validation-summary-errors\"]") WebElement error;
}
