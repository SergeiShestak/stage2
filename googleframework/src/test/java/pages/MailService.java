package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

public class MailService extends AbstractPage {

    WebDriverWait wait = new WebDriverWait(driver,5);
    final String URL_PAGE = "https://10minutemail.com";
    @FindBy(id = "copy_address")
    private WebElement address;
    @FindBy(xpath = "//div[@class = 'message_top']")
    private WebElement gottenMail;
    @FindBy(xpath = "//table[@class ='quote']/tbody/tr[2]/td[2]/h3")
    private WebElement resultFromMail;
    public static String gottenMailAdress;
    public static String gottenResultEstimate;

    public MailService(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @Override
    public MailService openPage() {

        driver.navigate().to(URL_PAGE);

        return this;
    }

    public String takeAdress() throws IOException, UnsupportedFlavorException {

        wait.until(ExpectedConditions.visibilityOf(address));
        address.click();
        return gottenMailAdress = Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor).toString();
    }

    public String takeMail() throws InterruptedException {

        Thread.sleep(30000);
        gottenMail.click();
        return gottenResultEstimate = resultFromMail.getText();
    }
}

