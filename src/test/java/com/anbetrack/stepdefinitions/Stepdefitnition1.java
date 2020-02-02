package com.anbetrack.stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.anbetrack.BaseUtilities.ActionsOnElement;
import com.anbetrack.Pages.AnbEtrackLoginpage;
import com.anbetrack.Pages.ConfigurationPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Stepdefitnition1 extends ActionsOnElement {
	 WebDriver driver;
	AnbEtrackLoginpage Loginpage;
	ConfigurationPage Configpage;
	
	@Given("open the Anb System eTrack+ login page")
	public void open_the_Anb_System_eTrack_login_page() {
	   driver = getDriver();
	   System.out.println("Launching the plus-stage anbetrack Site");
	   driver.get("https://plus-stage.anbetrack.com/#/");
	   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	   System.out.println("Maximize the window");
	   driver.manage().window().maximize();
	}

	@When("User enter the username and password")
	public void user_enter_the_username_and_password(DataTable DataTable) {
		Loginpage = new AnbEtrackLoginpage();
		List<Map<String, String>> Data = DataTable.asMaps(String.class, String.class);
		System.out.println("User enter the username");
		setText(Loginpage.getTxtUserId(), Data.get(0).get("Username"));
		System.out.println("User enter the password");
		setText(Loginpage.getTxtPassword(), Data.get(0).get("Password"));
			}

	@When("clicking the Signin Button")
	public void clicking_the_Signin_Button() {
		Loginpage = new AnbEtrackLoginpage();
		System.out.println("Click the Signin Button");
		clickbyJs(Loginpage.getBtnSignIn());
		System.out.println("Wait for page loading");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    
	}

	@Then("verify the user login successfully the page")
	public void verify_the_user_login_successfully_the_page() {
		Loginpage = new AnbEtrackLoginpage();
		System.out.println("verify the user login successfully the page");
		String Username = getText(Loginpage.getTxtUserName());
		Assert.assertEquals("Welcome Trump Trump. You are logged in as Superuser", Username);
		System.out.println(Username.substring(0, 20));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	@Given("open the Reference Configuration page")
	public void open_the_Reference_Configuration_page() {
		Configpage = new ConfigurationPage();
	    System.out.println("Clicking the HammerMenu");
	    clickbyJs(Configpage.getHamburgerMenu());
//	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    System.out.println("Clicking the Configuration");
	    clickbyJs(Configpage.getConfigurationLink());
//	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    System.out.println("Clicking the Reference");
	    clickbyJs(Configpage.getReferencesLink());
//	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	    String currentUrl = driver.getCurrentUrl();
//		   System.out.println(currentUrl);
	    
	}

	@When("User enter the requied details")
	public void user_enter_the_requied_details() {
		Configpage = new ConfigurationPage();
	    System.out.println("Clicking the AddnewReference");
	    clickbyJs(Configpage.getAddnewReference());
//	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    setText(Configpage.getTxtReferencename(), "Account Name");
	    setText(Configpage.getTxtDisplayname(), "Account Display Name");
	    setText(Configpage.getTxtDescription(), "Please ignore this for testing purpose");
	    clickbyJs(Configpage.getBtnAddNewValue());
//	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    setText(Configpage.getTxtValueName(), "Account Name");
	    setText(Configpage.getTxtDispalyname2(), "Account Display Name");
	}

	@When("clicking the Save Button")
	public void clicking_the_Save_Button() {
		Configpage = new ConfigurationPage();
	    System.out.println("Clicking the SaveBtn");
	    clickbyJs(Configpage.getBtnSave()); 
//	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     System.out.println("Clicking the SaveFinalBtn");
	    clickbyJs(Configpage.getBtnSaveFinal());
//	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Then("verify the user Create Reference successfully")
	public void verify_the_user_Create_Reference_successfully() {
	  
	}



}
