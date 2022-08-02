package com.sadakar.common;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BasePage {

	@Before //Cucumber Before Hook
	public  void setupDriver() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@After(order=0) // Cucumber After hook with order 0
	public  void quitDriver() throws Exception {
		driver.quit();
	}
	@After(order = 1) // Cucumber After Hook with order 1
	public void takeScreenShotOnFailedScenario(Scenario scenario) {

		System.out.println("This is from After hook, order=1");
		if ((scenario.isFailed())) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}

}
