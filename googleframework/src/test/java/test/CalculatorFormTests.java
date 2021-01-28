package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CalculatorPage;
import pages.GoogleCloudPage;
import pages.MailService;
import pages.SearchResultPage;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class CalculatorFormTests extends CommonConditions {


	public void switchWindows(int windowNumber){

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		int i = 1;
		while (iterator.hasNext() && i<3){
			driver.switchTo().window(String.valueOf(iterator.next()));
			System.out.println("Window title is " + driver.getTitle() + "size " + windows.size());
			if(i == windowNumber)
				break;
			i++;
		}
	}
	
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
	public void fillAndSubmitFormAndCompareResultMail() throws IOException, UnsupportedFlavorException,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,5);
		MailService mailService = new MailService(driver);
		CalculatorPage calculatorPage = new CalculatorPage(driver);
		calculatorPage.openPage()
					.fillForm()
					.takeEstimate();

		((JavascriptExecutor)driver).executeScript("window.open();");
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		switchWindows(0);
		mailService.openPage();
		mailService.takeAdress();

		switchWindows(1);

		calculatorPage.switchFrame()
				.sendMail(MailService.gottenMailAdress);

		switchWindows(0);
		mailService.takeMail();

		Assert.assertEquals(CalculatorPage.result,mailService.takeMail());
	}

}
