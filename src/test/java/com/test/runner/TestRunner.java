package com.test.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

//features= {"src/test/resources/ALogin","src/test/resources/FeatureFiles"}

@CucumberOptions(features= {"src/test/resources/FeatureFiles/GoogleSearch.feature"},monochrome=true,strict=true,//dryrun=true
glue= {"com.test.stepdefinition"},tags="@functional",plugin={"pretty","html:target/Cucumber",
		"json:target/Cucmber.json","junit:target/cukes.xml"})
 


public class TestRunner {

	@BeforeClass
	public static void start() {
		
	}
	
	@AfterClass
	public static void finish() {
		
	}
	
}
