package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="src\\test\\java\\com\\featurefiles\\openmrs.feature",
		glue ="com.stepdefinition",
		
		plugin = "html:OpenMRSReport/openMRSlogin.html"
		          
				
				
		
		)




public class Runner {
	
	


	
	

}
