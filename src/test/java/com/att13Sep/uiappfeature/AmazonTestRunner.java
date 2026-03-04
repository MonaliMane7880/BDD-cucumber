package com.att13Sep.uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "C:\\Users\\NEHA\\eclipse-workspace\\ATT13septBDDcucumberBasics\\src\\test\\resources\\uiappfeature" },

		glue = { "com.att13Sep.uiappfeature" },

		plugin = { "pretty", "html:target/cucumber_report/amazonreport.html"},

		publish = true

)
public class AmazonTestRunner extends AbstractTestNGCucumberTests {
	
	
	

}
