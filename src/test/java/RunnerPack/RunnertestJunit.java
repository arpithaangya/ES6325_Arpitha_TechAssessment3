package RunnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},features="C:\\Users\\ashekharangya\\Assessment3_Selenium_Arpitha\\com.Arpitha.TechAssessment\\src\\test\\resources\\features\\Register.feature",glue="com.Arpitha.TechAssessment")
public class RunnertestJunit {
	
	
}
