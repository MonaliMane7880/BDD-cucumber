package com.att13Sep.uiappfeature;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.att13Sept.utilities.PropReader;

import drivermanager.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	@BeforeAll
	public static void launchBrowser() throws IOException {
		Driverfactory df = new Driverfactory();

		WebDriver driver = df.initBrowser(PropReader.readPropFile("browser"));

		driver.manage().window().maximize();
	}

	@AfterAll
	public static void shutdown() {
		Driverfactory.getDriver().quit();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		boolean isScenarioFailed = scenario.isFailed();

		String nameOfScenario = scenario.getName();

		String newNameOfScenario = nameOfScenario.replace(" ", "_");

		if (isScenarioFailed) {
			TakesScreenshot ts = (TakesScreenshot) Driverfactory.getDriver();
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);

			scenario.attach(source, "image/png", newNameOfScenario);

		}
	}


}
