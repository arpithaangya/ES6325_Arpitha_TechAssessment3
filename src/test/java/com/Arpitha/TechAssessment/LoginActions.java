package com.Arpitha.TechAssessment;

import org.openqa.selenium.support.PageFactory;

public class LoginActions {

	LoginLocators loc ;
	LoginActions(){
		this.loc = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(),loc);
	}
	
	
	public void setuname(String uname) {
		loc.emailLog.sendKeys(uname);
	}
	public void setPass(String pass) {
		loc.passwordLog.sendKeys(pass);
	}
	public void clicklogin() {
		loc.loginBtn.click();
	}
	
	public void login(String struname,String password) {
		setuname(struname);
		setPass(password);
	}
}
