package testrunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 

	@CucumberOptions(
			features = {"C:\\Users\\singa\\eclipse-workspace\\BDD\\Signin.feature"},
			glue = {"Stepdefination"},
			dryRun = false,
			monochrome= true,
		    plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
			)
public class runnerSignin {
		
	}

