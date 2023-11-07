package com.Arpitha.TechAssessment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	String strUrl,strUsername,strPassword;
	void Utilty(){
		openLogin();
	}
	public void openLogin() {
		File file = new File("src\\test\\resources\\features\\data.properties");
		FileInputStream fileInput = null;
		
		try {
			fileInput = new FileInputStream(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	 
		strUrl = prop.getProperty("Link");
		strUsername = prop.getProperty("email");
		strPassword = prop.getProperty("password");
	}
}
