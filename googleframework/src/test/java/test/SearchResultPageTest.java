package test;

import driver.CommonConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchResultPage;

public class SearchResultPageTest extends CommonConditions {

    @Test

	public void openSearchResultPage (){

		SearchResultPage searchResultPage = new SearchResultPage(driver);
		searchResultPage.openPage()
				.selectCalculator();
		Assert.assertEquals("Google Cloud Platform Pricing Calculator",driver.getTitle(),"this interesting");
	}
}
