package com.sadakar.stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import com.sadakar.common.BasePage;
import com.sadakar.pageobjects.HRMLoginPageFactory;
import io.cucumber.java.en.Given;

public class HRMLogin extends BasePage {

	HRMLoginPageFactory hrmLoginPF = PageFactory.initElements(driver, HRMLoginPageFactory.class);

	@Given("User login to HRM application with UserName and Password")
	public void loginToHRMApp(io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> cells = dataTable.cells();
		hrmLoginPF.loginHRM(cells.get(0).get(0), cells.get(0).get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
