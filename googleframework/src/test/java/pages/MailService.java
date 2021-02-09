package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

public class MailService extends AbstractPage implements Transferable, ClipboardOwner {

    WebDriverWait wait;
    final String URL_PAGE = "https://10minutemail.com";
    @FindBy(id = "copy_address")
    private WebElement address;
    @FindBy(xpath = "//div[@class = 'message_top']")
    private WebElement gottenMail;
    @FindBy(xpath = "//table[@class ='quote']/tbody/tr[2]/td[2]/h3")
    private WebElement resultFromMail;
    @FindBy(id = "inbox count number")
    private WebElement countOfEmail;
    public static String gottenResultEstimate;

    public MailService(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
        wait = new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS);
    }
    @Override
    public MailService openPage() {
        driver.navigate().to(URL_PAGE);
        return this;
    }
    public String takeAdress() throws IOException, UnsupportedFlavorException {
        wait.until(ExpectedConditions.visibilityOf(address));
        address.click();
        return Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor).toString();
    }
    public String takeMail() throws InterruptedException {
        Thread.sleep(20000);
        gottenMail.click();
        return gottenResultEstimate = resultFromMail.getText();
    }
    @Override
    public void lostOwnership(Clipboard clipboard, Transferable transferable) { }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[0];
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return false;
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException, IOException {
        return null;
    }
}

