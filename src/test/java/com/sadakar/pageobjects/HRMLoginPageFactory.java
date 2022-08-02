package com.sadakar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HRMLoginPageFactory {

	final WebDriver driver;

	// Constructor, as every page needs a Webdriver to find elements
	public HRMLoginPageFactory(WebDriver driver) {
		this.driver = driver;
	}
	// Locators for User Name, Password and  for Login button

	// UserName
	@FindBy(xpath = "//*[@id=\"txtUsername\"]")
	public WebElement userNameLocator;

	// Password
	@FindBy(xpath = "//*[@id=\"txtPassword\"]")
	public WebElement passwordLocator;

	// Login button
	@FindBy(id = "btnLogin")
	public WebElement loginButtonLocator;

	// Method that performs Login action using the web elements
	public void loginHRM(String uName, String pwd) {
		userNameLocator.sendKeys(uName);
		passwordLocator.sendKeys(pwd);
		loginButtonLocator.click();
	}

}
