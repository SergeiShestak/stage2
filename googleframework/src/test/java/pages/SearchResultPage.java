package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends AbstractPage {
	
	private final String PAGE_URL = "https://cloud.google.com/s/results?q=Google%20Cloud%20platform%20calculator";
	private final Logger logger = LogManager.getRootLogger();
	
	@FindBy(xpath = "//a[@class='gs-title']")
	private WebElement selectCalculatorPlatform;
	
	public SearchResultPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver,this);
	}
	@Override
	public SearchResultPage openPage() {
		
		driver.navigate().to(PAGE_URL);
		logger.info("Search result page opened");
		return this;
	}
	public CalculatorPage selectCalculator() {
		
		selectCalculatorPlatform.click();
		return new CalculatorPage(driver);
	}
}
