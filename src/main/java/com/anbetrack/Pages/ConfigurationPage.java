package com.anbetrack.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.anbetrack.BaseUtilities.ActionsOnElement;

public class ConfigurationPage extends ActionsOnElement {

	@FindBy(xpath = "(//*[contains(@class,'etp-icon etp-hamburger')])[1]")
	private WebElement HamburgerMenu;
	@FindBy(xpath = "(//*[contains(text(),'Configuration')])[1]")
	private WebElement ConfigurationLink;
	@FindBy(xpath = "(//*[contains(text(),'References')])[2]")
	private WebElement ReferencesLink;
	@FindBy(xpath = "//*[@class='etp-icon etp-add']")
	private WebElement AddnewReference;
	@FindBy(xpath = "(//*[@class='el-input__inner'])[2]")
	private WebElement txtReferencename;
	@FindBy(xpath = "(//*[@class='el-input__inner'])[3]")
	private WebElement txtDisplayname;
	@FindBy(xpath = "(//*[@class='el-textarea__inner'])[1]")
	private WebElement txtDescription;
	@FindBy(xpath = "(//*[@class='el-input__inner'])[4]")
	private WebElement txtValueName;
	@FindBy(xpath = "(//*[@class='el-input__inner'])[5]")
	private WebElement txtDispalyname2;
	@FindBy(xpath = "(//*[contains(text(),'Add New Value')])[1]")
	private WebElement BtnAddNewValue;
	@FindBy(xpath = "(//*[@class='etp-icon etp-save'])[2]")
	private WebElement BtnSave;
	@FindBy(xpath = "(//*[@class='etp-icon etp-save'])[1]")
	private WebElement BtnSaveFinal;

	public ConfigurationPage () {
		PageFactory.initElements(driver, this);
	}

	public WebElement getHamburgerMenu() {
		return HamburgerMenu;
	}

	

	public WebElement getConfigurationLink() {
		return ConfigurationLink;
	}

	

	public WebElement getReferencesLink() {
		return ReferencesLink;
	}

	

	public WebElement getAddnewReference() {
		return AddnewReference;
	}

	

	public WebElement getTxtReferencename() {
		return txtReferencename;
	}

	

	public WebElement getTxtDisplayname() {
		return txtDisplayname;
	}

	

	public WebElement getTxtDescription() {
		return txtDescription;
	}

	

	public WebElement getTxtValueName() {
		return txtValueName;
	}

	

	public WebElement getTxtDispalyname2() {
		return txtDispalyname2;
	}

	

	public WebElement getBtnAddNewValue() {
		return BtnAddNewValue;
	}

	

	public WebElement getBtnSave() {
		return BtnSave;
	}

	
	public WebElement getBtnSaveFinal() {
		return BtnSaveFinal;
	}

	
}
