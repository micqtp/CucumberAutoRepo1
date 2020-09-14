package com.JavaFiles;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;  // Cucumber.class
import cucumber.api.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
		
	    monochrome	= true,

	    tags = {"@Smoke,@Regression"},		// OR Condition
	    
		features = {"src/test/resources/com/FeatureFiles/"},
		glue = {"com/JavaFiles/"},
			
		plugin = {"pretty", 
				  "html:target/cucumber-htmlreport",
				  "json:target/cucumber-jsonreport.json",
				  "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport123.html"
		}			
	)
		
public class TestRunnerFile {		// This class name must be ended with 'Test' to run as 'Maven Test'

}
