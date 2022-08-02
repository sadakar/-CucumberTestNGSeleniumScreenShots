package com.sadakar.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectoryPageFactory {

	final WebDriver driver;

	// Constructor, as every page needs a Webdriver to find elements
	public DirectoryPageFactory(WebDriver driver) {
		this.driver = driver;
	}
	// Locators for directory tab,search button

	// Directory tab locator
	@FindBy(xpath = "//*[@id=\"menu_directory_viewDirectory\"]")
	public WebElement viewDirectoryLinkLocator;

	// Search button locator
	@FindBy(xpath = "//*[@id=\"searchBtnBAD\"]")
	public WebElement searchButtonLocator;

	// Method that performs click on Directory tab
	public void viewDirectoryTabNavigation() {
		viewDirectoryLinkLocator.click();
	}

	// Method that checks the search button presence
	public boolean verifySearchButtonPresense() {
		return searchButtonLocator.isDisplayed();
	}
}
