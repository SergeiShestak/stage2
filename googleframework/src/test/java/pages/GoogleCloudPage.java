package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleCloudPage extends AbstractPage {
	
	
	private final Logger logger = LogManager.getRootLogger();
	private final String URL_PAGE = "https://cloud.google.com";
	private final String inputSearchInfo = "Google Cloud Platform Calculator";
	WebDriverWait wait;
	@FindBy(name = "q")
	WebElement inputField;
	
	public GoogleCloudPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver,this);
		wait = new WebDriverWait(driver,10);
	}

	@Override
	public GoogleCloudPage openPage() {
		
		driver.navigate().to(URL_PAGE);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));

		logger.info("Start Page opened");
		return this;
	}

	
	public SearchResultPage openSearchResultPage() {
		inputField.click();
		inputField.sendKeys(inputSearchInfo,Keys.RETURN);
		return new SearchResultPage(driver);
	}
	
	
	
	

}
