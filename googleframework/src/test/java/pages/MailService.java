package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class MailService extends AbstractPage {

    final String URL_PAGE = "https://10minutemail.com";
    @FindBy(id = "copy_address")
    private WebElement address;

    public MailService(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    @Override
    public MailService openPage() {

        driver.navigate().to(URL_PAGE);

        return this;
    }

    public String takeAdress() throws IOException, UnsupportedFlavorException {

        address.click();
        return Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor).toString();
    }

    public void takeMail(){

        return ;
    }
}

