package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.VirtualMachineInitialiser;
import java.time.Duration;

public class CalculatorPage extends AbstractPage {
	WebDriverWait wait;
	VirtualMachineInitialiser machine;
	private final String PAGE_URL = "https://cloud.google.com/products/calculator";
	private final Logger logger = LogManager.getRootLogger();
	public static String result;
	@FindBy(xpath = "//button[@aria-label = 'Add to Estimate']")
	private WebElement buttonAdd;
	@FindBy(xpath = "//b[@class = 'ng-binding']")
	private WebElement resultEstimate;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement inputForEmailAddress;
	@FindBy(xpath = "//button[@aria-label = 'Email Estimate']")
	private WebElement buttonEmail;
	@FindBy(xpath = "//button[@aria-label = 'Send Email']")
	private WebElement buttonSendEmail;

	public CalculatorPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver,this);
		wait = new WebDriverWait(this.driver,WAIT_TIMEOUT_SECONDS);
	}
	@Override
	public CalculatorPage openPage() {
		driver.navigate().to(PAGE_URL);
		driver.switchTo().frame(0);
		driver.switchTo().frame("myFrame");
		logger.info("Calculator page opened");
		return this;
	}
	public CalculatorPage fillForm() {
		machine = new VirtualMachineInitialiser(driver);
		machine.virtualMachineInitialiser();
		wait.until(ExpectedConditions.visibilityOf(buttonAdd));
		buttonAdd.click();
		logger.info("Form full");
		return this;
	}
	public String takeEstimate(){
		result = resultEstimate.getText().substring(resultEstimate.getText().indexOf(":"));
		buttonEmail.click();
		wait.until(ExpectedConditions.visibilityOf(inputForEmailAddress));
		return result;
	}
	public CalculatorPage switchFrame(){
		driver.switchTo().frame(0).switchTo().frame("myFrame");
		return this;
	}
	public void sendMail(String mailAddress){
		inputForEmailAddress.click();
		wait.withTimeout(Duration.ofSeconds(2));
		inputForEmailAddress.sendKeys(mailAddress);
		wait.until(ExpectedConditions.elementToBeClickable(buttonSendEmail));
		buttonSendEmail.click();
	}
}
