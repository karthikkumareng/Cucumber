package com.anbetrack.stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.anbetrack.BaseUtilities.ActionsOnElement;
import com.anbetrack.Pages.AnbEtrackLoginpage;
import com.anbetrack.Pages.ConfigurationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginfunctionality extends ActionsOnElement {
	
	WebDriver driver;
	AnbEtrackLoginpage Loginpage;
	ConfigurationPage Configpage;

	@Given("launch the Anb System eTrack+ login page")
	public void launch_the_Anb_System_eTrack_login_page() {
		driver = getDriver();
		   System.out.println("Launching the plus-stage anbetrack Site");
		   driver.get("https://plus-stage.anbetrack.com/#/");
		   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		   System.out.println("Maximize the window");
		   driver.manage().window().maximize();
	}

	@When("User verify the {string} and {string} functionality")
	public void user_verify_the_and_functionality(String string, String string2) {
		Loginpage = new AnbEtrackLoginpage();
		
		System.out.println("User enter the username");
		setText(Loginpage.getTxtUserId(), string);
		System.out.println("User enter the password");
		setText(Loginpage.getTxtPassword(), string2);
	    
	}


	@When("clicking the Login Button")
	public void clicking_the_Login_Button() {
		Loginpage = new AnbEtrackLoginpage();
		System.out.println("Click the Signin Button");
		clickbyJs(Loginpage.getBtnSignIn());
		System.out.println("Wait for page loading");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Then("verify the user login scenarios the page")
	public void verify_the_user_login_scenarios_the_page() {
	    driver.close();
	    System.out.println("Closing the browser");
	}



}
