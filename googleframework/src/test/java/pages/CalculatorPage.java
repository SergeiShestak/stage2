package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CalculatorPage extends AbstractPage {
	
	
	WebDriverWait wait;
	private final String PAGE_URL = "https://cloud.google.com/products/calculator";
	private final Logger logger = LogManager.getRootLogger();
	public static String result;
	@FindBy(xpath = "//input[@aria-label = 'quantity']")
	private WebElement quantityOfInstances;
	@FindBy(id = "select_88")
	private WebElement selectSeries;
	@FindBy(xpath = "//md-option[@value = 'n1']")
	private WebElement selectN1Series;
	@FindBy(id = "select_value_label_60")
	private WebElement selectMachineType;
	@FindBy(xpath = "//md-option[@value = 'CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']")
	private WebElement selectMachineType8;
	@FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs']")
	private WebElement addingGPU;
	@FindBy(xpath = "//md-select[@placeholder = 'Number of GPUs']")
	private WebElement selectAmountGPU;
	@FindBy(xpath = "//md-select[@placeholder = 'GPU type']")
	private WebElement typeOfGPU;
	@FindBy(xpath = "//md-option[@value = 'NVIDIA_TESLA_T4']")
	private WebElement typeGPUTesla;
	@FindBy(xpath = "//md-select[@placeholder = 'Committed usage'][@aria-label = 'Committed usage: None']")
	private WebElement usageBox;
	@FindBy(id = "select_option_97")
	private WebElement usageOneYear;
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
		
		quantityOfInstances.click();
		quantityOfInstances.sendKeys("4");
		selectSeries.click();
		wait.until(ExpectedConditions.visibilityOf(selectN1Series));
		selectN1Series.click();
		wait.until(ExpectedConditions.visibilityOf(selectMachineType));
		selectMachineType.click();
		wait.until(ExpectedConditions.visibilityOf(selectMachineType8));
		selectMachineType8.click();
		addingGPU.click();
		wait.withTimeout(Duration.ofSeconds(3));
		selectAmountGPU.sendKeys("2");
		typeOfGPU.click();
		wait.until(ExpectedConditions.visibilityOf(typeGPUTesla));
		typeGPUTesla.click();
		wait.withTimeout(Duration.ofSeconds(3));
		usageBox.click();
		wait.until(ExpectedConditions.visibilityOf(usageOneYear));
		usageOneYear.click();
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

		driver.switchTo().frame(0)
				.switchTo()
				.frame("myFrame");

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
