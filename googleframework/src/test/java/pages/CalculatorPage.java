package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.HandlingTabs;

import java.time.Duration;

public class CalculatorPage extends AbstractPage implements HandlingTabs {
	WebDriverWait wait;
	private final String PAGE_URL = "https://cloud.google.com/products/calculator";
	private final Logger logger = LogManager.getRootLogger();
	public static String result;
	@FindBy(id = "select_option_96")
	private WebElement usageInputBox;
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

	public CalculatorPage() {
		PageFactory.initElements(this.driver,this);
		wait = new WebDriverWait(this.driver,WAIT_TIMEOUT_SECONDS);
	}
	@Override
	public CalculatorPage openPage() {
		driver.navigate().to(PAGE_URL);
		driver.switchTo().frame(0);
		driver.switchTo().frame("myFrame");
		logger.info("Calculator page is opened");
		return this;
	}
	public CalculatorPage instanceSelection (String instances,String quantity) {
		driver.findElement(By.xpath(instances)).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(instances)));
		driver.findElement(By.xpath(instances)).sendKeys(quantity);
		return this;
	}
	public CalculatorPage openSeriesSelection (String seriesField) {
		driver.findElement(By.id(seriesField)).click();
		return this;
	}
	public CalculatorPage seriesSelection (String series){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(series)));
		driver.findElement(By.xpath(series)).click();
		return this;
	}
	public CalculatorPage openMachineTypeSelection(String fieldMachineType) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(fieldMachineType)));
		driver.findElement(By.id(fieldMachineType)).click();
		return this;
	}
	public CalculatorPage machineTypeSelection (String selectionMachineType){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectionMachineType)));
		driver.findElement(By.xpath(selectionMachineType)).click();
		return this;
	}
	public CalculatorPage addGPU (String addingGpu) {
		driver.findElement(By.xpath(addingGpu)).click();
		return this;
	}
	public CalculatorPage amountGPUSelection (String fieldGPU,String amountGPU) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fieldGPU)));
		driver.findElement(By.xpath(fieldGPU)).sendKeys(amountGPU);
		return this;
	}
	public CalculatorPage openTypeOfGPUSelection (String fieldTypeOfGPU) {
		driver.findElement(By.xpath(fieldTypeOfGPU)).click();
		return this;
	}
	public CalculatorPage typeOfGPUSelect(String selectTypeGPU) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectTypeGPU)));
		driver.findElement(By.xpath(selectTypeGPU)).click();
		return this;
	}
	public CalculatorPage openLocalSSDSelection(String amountLocalSSD) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(amountLocalSSD)));
		driver.findElement(By.xpath(amountLocalSSD)).click();
		return this;
	}
	public CalculatorPage localSSDSelection(String selectAmountLocalSSD) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectAmountLocalSSD)));
		driver.findElement(By.xpath(selectAmountLocalSSD)).click();
		return this;
	}
	public CalculatorPage selectAmountLocalSSD (String fieldLocalSSD,String amountLocalSSD){
		driver.findElement(By.xpath(fieldLocalSSD)).sendKeys(amountLocalSSD);
		return this;
	}
	public CalculatorPage openUsageSelection (String usageBox) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(usageBox)));
		driver.findElement(By.xpath(usageBox)).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(usageBox)));
		return this;
	}
	public CalculatorPage usageSelection(String year){
		usageInputBox.click();
		wait.withTimeout(Duration.ofSeconds(2));
		usageInputBox.sendKeys(year);
		return this;
	}

	public CalculatorPage submitForm() {
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
	public CalculatorPage shiftAddressMail(String mailAddress) {
		inputForEmailAddress.click();
		wait.withTimeout(Duration.ofSeconds(2));
		return this;
	}
	public void sendMail(){
		wait.until(ExpectedConditions.elementToBeClickable(buttonSendEmail));
		buttonSendEmail.click();
	}
}
