package test;

import driver.CommonConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;
import pages.MailService;
import service.VirtualMachineService;
import service.VirtualMachineInitializer;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class CalculatorFormTests extends CommonConditions {
	String gottenMailAdress;
	String result;
	String gottenResultEstimate;

	@Test
	public void fillAndSubmitFormAndCompareResultMail() throws IOException, UnsupportedFlavorException, InterruptedException {
		MailService mailService = new MailService();
		CalculatorPage calculatorPage = new CalculatorPage();
		new VirtualMachineService().createVirtualMachine(VirtualMachineInitializer.virtualMachineInitializer());
		result = calculatorPage.takeEstimate();
		calculatorPage.openNewWindow();
		calculatorPage.switchWindows(0);
		mailService.openPage();
		gottenMailAdress = mailService.takeAdress();
		calculatorPage.switchWindows(1);
		calculatorPage.switchFrame();
		calculatorPage.shiftAddressMail(gottenMailAdress);
		calculatorPage.sendMail();
		calculatorPage.switchWindows(0);
		gottenResultEstimate = mailService.takeMail();
		Assert.assertTrue(result.contains(gottenResultEstimate));
	}

}
