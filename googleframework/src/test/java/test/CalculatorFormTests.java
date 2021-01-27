package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CalculatorPage;
import pages.GoogleCloudPage;
import pages.SearchResultPage;

public class CalculatorFormTests extends CommonConditions {
	
//	@Test
//
//	public void startFirstPage(){
//
//		GoogleCloudPage googleCloudPage = new GoogleCloudPage(driver);
//		googleCloudPage.openPage()
//				.openSearchResultPage();
//		//Assert.assertEquals(this,driver.getTitle(),"equals");
//	}
//
//	@Test
//
//	public void openSecondPage (){
//
//		SearchResultPage searchResultPage = new SearchResultPage(driver);
//		searchResultPage.openPage()
//				.selectCalculator();
//		//Assert.assertEquals(this,driver.getCurrentUrl(),"this interesting");
//	}
	@Test
	public void fillingForm() {

		CalculatorPage calculatorPage = new CalculatorPage(driver);
		calculatorPage.openPage()
					.fillForm()
					.takeEstimate();
		System.out.println("!my test!: " + calculatorPage.takeEstimate());

	}

}
