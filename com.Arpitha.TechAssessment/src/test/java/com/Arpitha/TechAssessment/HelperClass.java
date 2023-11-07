package com.Arpitha.TechAssessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelperClass {

	public static HelperClass helperclass;
	public static WebDriver driver;
	
	HelperClass(){
	   	
		driver= new EdgeDriver();
		driver.manage().window().maximize();
	}
	public static void OpenUrl(String url) {
			driver.get(url);
		}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(helperclass == null) {
			helperclass = new HelperClass();
			
		}
	}
	
	
}
	

