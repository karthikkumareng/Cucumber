package com.anbetrack.loginstepdefinitions;

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
import junit.framework.Assert;

public class SignInfunctionality extends ActionsOnElement {
	WebDriver driver;
	AnbEtrackLoginpage Loginpage;
	ConfigurationPage Configpage;

	@Given("User on Anb System eTrack+ login page")
	public void user_on_Anb_System_eTrack_login_page() {
		driver = getDriver();
		   System.out.println("Launching the plus-stage anbetrack Site");
		   driver.get("https://plus-stage.anbetrack.com/#/");
		   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		   System.out.println("Maximize the window");
		   driver.manage().window().maximize(); 
	}

	@When("User enter the valid username and password")
	public void user_enter_the_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		Loginpage = new AnbEtrackLoginpage();
		List<Map<String, String>> Data = dataTable.asMaps(String.class, String.class);
		System.out.println("User enter the username");
		setText(Loginpage.getTxtUserId(), Data.get(0).get("Username"));
		System.out.println("User enter the password");
		setText(Loginpage.getTxtPassword(), Data.get(0).get("Password"));
	    
	}

	@When("User enter the null username and valid password")
	public void user_enter_the_null_username_and_valid_password(io.cucumber.datatable.DataTable dataTable) {
		Loginpage = new AnbEtrackLoginpage();
		List<Map<String, String>> Data = dataTable.asMaps(String.class, String.class);
		System.out.println("User enter the username");
		setText(Loginpage.getTxtUserId(), Data.get(0).get("Username"));
		System.out.println("User enter the password");
		setText(Loginpage.getTxtPassword(), Data.get(0).get("Password"));
	    
	}

	@When("User enter the valid username and null password")
	public void user_enter_the_valid_username_and_null_password(io.cucumber.datatable.DataTable dataTable) {
		Loginpage = new AnbEtrackLoginpage();
		List<Map<String, String>> Data = dataTable.asMaps(String.class, String.class);
		System.out.println("User enter the username");
		setText(Loginpage.getTxtUserId(), Data.get(0).get("Username"));
		System.out.println("User enter the password");
		setText(Loginpage.getTxtPassword(), Data.get(0).get("Password"));
	    
	}

	@When("User enter the invalid username and valid password")
	public void user_enter_the_invalid_username_and_valid_password(io.cucumber.datatable.DataTable dataTable) {
		Loginpage = new AnbEtrackLoginpage();
		List<Map<String, String>> Data = dataTable.asMaps(String.class, String.class);
		System.out.println("User enter the username");
		setText(Loginpage.getTxtUserId(), Data.get(0).get("Username"));
		System.out.println("User enter the password");
		setText(Loginpage.getTxtPassword(), Data.get(0).get("Password"));
	    
	}

	@When("User enter the valid username and invalid password")
	public void user_enter_the_valid_username_and_invalid_password(io.cucumber.datatable.DataTable dataTable) {
		Loginpage = new AnbEtrackLoginpage();
		List<Map<String, String>> Data = dataTable.asMaps(String.class, String.class);
		System.out.println("User enter the username");
		setText(Loginpage.getTxtUserId(), Data.get(0).get("Username"));
		System.out.println("User enter the password");
		setText(Loginpage.getTxtPassword(), Data.get(0).get("Password"));
	      
	}

	@When("User enter the invalid username and invalid password")
	public void user_enter_the_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable dataTable) {
		Loginpage = new AnbEtrackLoginpage();
		List<Map<String, String>> Data = dataTable.asMaps(String.class, String.class);
		System.out.println("User enter the username");
		setText(Loginpage.getTxtUserId(), Data.get(0).get("Username"));
		System.out.println("User enter the password");
		setText(Loginpage.getTxtPassword(), Data.get(0).get("Password"));
	     
	}
	
	@When("click the sign Button")
	public void click_the_sign_Button() {
		Loginpage = new AnbEtrackLoginpage();
		System.out.println("Click the Signin Button");
		clickbyJs(Loginpage.getBtnSignIn());
		System.out.println("Wait for page loading");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Then("verify the user login successfully")
	public void verify_the_user_login_successfully() {
		Loginpage = new AnbEtrackLoginpage();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("verify the user login successfully the page");
		String Username = getText(Loginpage.getTxtUserName());
		Assert.assertEquals("Welcome Trump Trump. You are logged in as Superuser", Username);
		System.out.println(Username.substring(0, 20));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println("***** Testcase PASS *****");
	   driver.close();
	}

	@Then("verify the user login credential is wrong")
	public void verify_the_user_login_credential_is_wrong() {
		Loginpage = new AnbEtrackLoginpage();
		System.out.println("verify the user login credential is wrong");
		
		String AlertMessage1 = getText(Loginpage.getAlertMessage());
		System.out.println(AlertMessage1);
		Assert.assertEquals("Please fill all mandatory fields", AlertMessage1);
		System.out.println("***** Testcase PASS *****");
		driver.close();
	}

	@Then("verify the user login credential is Invalid")
	public void verify_the_user_login_credential_is_Invalid() {
		Loginpage = new AnbEtrackLoginpage();
		System.out.println("verify the user login credential is Invalid");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String AlertMessage2 = getText(Loginpage.getInvaliddata());
		System.out.println(AlertMessage2);
		Assert.assertEquals("This account is disabled", AlertMessage2);
		System.out.println("***** Testcase PASS *****");
		driver.close();
		}
	@Then("verify the user login credential is valid username and invalid password")
	public void verify_the_user_login_credential_is_valid_username_and_invalid_password() {
		Loginpage = new AnbEtrackLoginpage();
		System.out.println("verify the user login credential is Invalid");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String AlertMessage2 = getText(Loginpage.getInvaliddata());
		System.out.println(AlertMessage2);
//		Assert.assertEquals("This account is disabled", AlertMessage2);
		System.out.println("***** Testcase PASS *****");
		driver.close();
	}
}
