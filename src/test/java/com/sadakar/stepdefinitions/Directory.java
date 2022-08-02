package com.sadakar.stepdefinitions;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.sadakar.common.BasePage;
import com.sadakar.pageobjects.DirectoryPageFactory;
import io.cucumber.java.en.Then; 

public class Directory extends BasePage{

	DirectoryPageFactory directoryPF = PageFactory.initElements(driver, DirectoryPageFactory.class);
	
	@Then("User is on Directory page")
	public void directoryPage() {

		// Navigating to Directory Page/tab
		directoryPF.viewDirectoryTabNavigation();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Then("Is Search button displayed")
	public void isSearchButtonDisplayed() {
	
		// Verifying Search button is displayed or not
		boolean isSearhButtonDisplayedTrue = directoryPF.verifySearchButtonPresense();
		Assert.assertTrue(isSearhButtonDisplayedTrue);
	}
}