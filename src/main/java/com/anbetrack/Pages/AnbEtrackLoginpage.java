package com.anbetrack.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.anbetrack.BaseUtilities.ActionsOnElement;

public class AnbEtrackLoginpage extends ActionsOnElement {

@FindBy(xpath = "(//*[@class='el-input__inner'])[1]")
private WebElement txtUserId;

@FindBy(xpath = "(//*[@class='el-input__inner'])[2]")
private WebElement txtPassword;

@FindBy(xpath = "(//*[contains(@class,'primary el-button')])[1]")
private WebElement BtnSignIn;

@FindBy(xpath = "//*[@class='welcome-notification fl mt2']")
private WebElement txtUserName;

@FindBy(xpath = "(//*[text()='Please fill all mandatory fields'])[1]")
private WebElement AlertMessage;

@FindBy(xpath = "(//*[@class='el-message__content'])[1]")
private WebElement Invaliddata;





public AnbEtrackLoginpage () {
	PageFactory.initElements(driver, this);
}


public WebElement getAlertMessage() {
	return AlertMessage;
}


public void setAlertMessage(WebElement alertMessage) {
	AlertMessage = alertMessage;
}


public WebElement getTxtUserId() {
	return txtUserId;
}


public void setTxtUserId(WebElement txtUserId) {
	this.txtUserId = txtUserId;
}


public WebElement getTxtPassword() {
	return txtPassword;
}


public void setTxtPassword(WebElement txtPassword) {
	this.txtPassword = txtPassword;
}


public WebElement getBtnSignIn() {
	return BtnSignIn;
}


public void setBtnSignIn(WebElement btnSignIn) {
	BtnSignIn = btnSignIn;
}


public WebElement getTxtUserName() {
	return txtUserName;
}


public void setTxtUserName(WebElement txtUserName) {
	this.txtUserName = txtUserName;
}

public WebElement getInvaliddata() {
	return Invaliddata;
}


public void setInvaliddata(WebElement invaliddata) {
	Invaliddata = invaliddata;
}





}