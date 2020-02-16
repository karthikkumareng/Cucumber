package com.anbetrack.testrunner;



import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import cucumber.api.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Velmurugan\\AnbETrack\\src\\resource\\java\\Features\\loginfunctionality.feature", 
		glue = {"com.anbetrack.loginstepdefinitions","com.anbetrack.hook"}, plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json"}, 
		monochrome = true, 																	
		strict = true, 
		dryRun = false
//		tags = {"@tag1,@tag2"}
		)


public class TestRunner  {
//	@AfterClass
//	 public static void writeExtentReport() {
//		try {
//	 Reporter.loadXMLConfig(new File("src/main/java/com/anbetrack/config/extent-config.xml"));
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	 }
}
