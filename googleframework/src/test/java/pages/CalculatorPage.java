package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends AbstractPage {
	
	
	private final String PAGE_URL = "https://cloud.google.com/products/calculator";
	private final Logger logger = LogManager.getRootLogger();
	@FindBy(id = "input_63")
	private WebElement quantityOfInstances;
	@FindBy(xpath = "//span[class = 'md-select-icon']")
	private WebElement selectSeries;
	@FindBy(xpath = "//div[class = 'md-text ng-binding']")
	private WebElement selectN2Series;
	

	public CalculatorPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver,this);
		
	}

	@Override
	public CalculatorPage openPage() {
		
		driver.navigate().to(PAGE_URL);
		driver.switchTo().frame(0);
		driver.switchTo().frame("MyFrame");
		logger.info("Calculator page opened");
		
		return this;
	}
	
	public CalculatorPage fillForm() {
		
		quantityOfInstances.click();
		quantityOfInstances.sendKeys("4");
		selectSeries.click();
		selectN2Series.click();
		
		return this;
	}
	
	
	

}
