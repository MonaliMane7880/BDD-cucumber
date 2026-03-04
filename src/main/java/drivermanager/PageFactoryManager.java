package drivermanager;

import org.openqa.selenium.WebDriver;

import com.att13sep.pages.HomePage;
import com.att13sep.pages.SearchPage;

public class PageFactoryManager {
	
	HomePage homepage;
	SearchPage searchpage;

	public HomePage getHomePageObject(WebDriver driver) {
		if (homepage == null) {
			return homepage = new HomePage(driver);
		}

		else {
			return homepage;
		}

}
	
	public SearchPage getSearchPageObject(WebDriver driver) {
		if (searchpage == null) {
			return searchpage = new SearchPage(driver);
		}

		else {
			return searchpage;
		}

	}
}
