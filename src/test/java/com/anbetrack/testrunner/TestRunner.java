package com.anbetrack.testrunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Velmurugan\\AnbETrack\\src\\resource\\java\\Features\\AnbSytem.feature", 
		glue = "com.anbetrack.stepdefinitions",plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
				 "rerun:target/cucumber-reports/rerun.txt" }, 
		monochrome = true, 																	
		strict = true, 
		dryRun = false
		)


public class TestRunner {

}
