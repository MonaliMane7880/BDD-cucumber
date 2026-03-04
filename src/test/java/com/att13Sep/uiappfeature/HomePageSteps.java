package com.att13Sep.uiappfeature;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.att13sep.pages.HomePage;
import com.att13Sept.utilities.PropReader;


import drivermanager.Driverfactory;
import drivermanager.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	HomePage homepage;

	public HomePageSteps() {
//		PageFactoryManager pm = new PageFactoryManager();

		homepage = new PageFactoryManager().getHomePageObject(Driverfactory.getDriver());
	}

	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() throws InterruptedException, IOException {
		WebDriver driver = Driverfactory.getDriver();

		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();

	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String string) {

		String title = homepage.getTitleOfPage();

		boolean isWordPresent = title.contains(string);

		Assert.assertEquals(isWordPresent, true);

	}

	@Then("cart icon should get displayed")
	public void cart_icon_should_get_displayed() {

		boolean isDisplayed = homepage.isCartIconDisplayed();

		Assert.assertEquals(isDisplayed, true);

	}

	@When("user clicks on soundbar deal")
	public void user_clicks_on_soundbar_deal() {
		homepage.checkoutDealsSection();
	}

	@Then("user should redirect to deal page")
	public void user_should_redirect_to_deal_page() {
		String textOnPage = homepage.getPageInfo();
		
		System.out.println(textOnPage);
		
		boolean isPresentInsideTheText= textOnPage.contains("Brands in Focus Deals");
		
		Assert.assertEquals(isPresentInsideTheText, true);
	}

}