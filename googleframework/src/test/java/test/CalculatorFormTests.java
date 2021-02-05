package test;

import driver.CommonConditions;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CalculatorPage;
import pages.MailService;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class CalculatorFormTests extends CommonConditions {

	String gottenMailAdress;
	String result;
	String gottenResultEstimate;

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


	@Test
	public void fillAndSubmitFormAndCompareResultMail() throws IOException, UnsupportedFlavorException,InterruptedException {

		MailService mailService = new MailService(driver);
		CalculatorPage calculatorPage = new CalculatorPage(driver);
		result = calculatorPage.openPage()
					.fillForm()
					.takeEstimate();

		((JavascriptExecutor)driver).executeScript("window.open();");

		switchWindows(0);
		mailService.openPage();
		gottenMailAdress = mailService.takeAdress();

		switchWindows(1);

		calculatorPage.switchFrame()
				.sendMail(gottenMailAdress);

		switchWindows(0);
		gottenResultEstimate = mailService.takeMail();

		Assert.assertTrue(result.contains(gottenResultEstimate));
	}

}
