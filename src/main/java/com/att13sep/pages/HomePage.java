package com.att13sep.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePageUtility {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//*[@id='nav-cart123']")
	private WebElement cartIcon;

	@FindBy(xpath = "//*[contains(@alt,'Great Indian Festival')]/parent::a")
	private WebElement greatIndianFestival;

	@FindBy(xpath = "//*[@class='a-spacing-mini']//span")
	private WebElement textOnPage;

	public String getTitleOfPage() {
		String title = driver.getTitle();

		return title;
	}

	public boolean isCartIconDisplayed() {
		boolean isDisplaying = cartIcon.isDisplayed();

		return isDisplaying;
	}

	public void checkoutDealsSection() {
		waitForVisibilityOfElement(greatIndianFestival);
		JavascriptExecutor js = (JavascriptExecutor)driver;// typecasting to javascript executor
		js.executeScript("arguments[0].click();", greatIndianFestival);
//		click(greatIndianFestival);

	}

	public String getPageInfo() {
		waitForVisibilityOfElement(textOnPage);
		String text = textOnPage.getText();

		return text;

	}
}