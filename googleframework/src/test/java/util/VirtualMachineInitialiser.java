package util;

import model.VirtualMachine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;
import java.time.Duration;

public class VirtualMachineInitialiser extends AbstractPage {
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
    @FindBy(xpath = "//md-option[@value = 'NVIDIA_TESLA_T4'][@id = 'select_option_407']")
    private WebElement typeGPUTesla;
    @FindBy(xpath = "//md-select-value[@id = 'select_value_label_354']")
    private WebElement amountLocalSSD;
    @FindBy(id = "select_option_379")
    private WebElement amount0LocalSSD;
    @FindBy(xpath = "//md-select[@placeholder = 'Committed usage'][@aria-label = 'Committed usage: None']")
    private WebElement usageBox;
    @FindBy(id = "select_option_97")
    private WebElement usageOneYear;
    VirtualMachine machine;
    WebDriverWait wait;

    public VirtualMachineInitialiser(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(this.driver,WAIT_TIMEOUT_SECONDS);
        PageFactory.initElements(this.driver,this);
        machine = new VirtualMachine(this.driver);
    }
    public VirtualMachine virtualMachineInitialiser(){
        quantityOfInstances.click();
        quantityOfInstances.sendKeys(machine.getQuantityOfInstances());
        selectSeries.click();
        wait.until(ExpectedConditions.visibilityOf(selectN1Series));
        selectN1Series.click();
        wait.until(ExpectedConditions.visibilityOf(selectMachineType));
        selectMachineType.click();
        wait.until(ExpectedConditions.visibilityOf(selectMachineType8));
        selectMachineType8.click();
        addingGPU.click();
        wait.withTimeout(Duration.ofSeconds(3));
        typeOfGPU.click();
        //wait.withTimeout(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(typeGPUTesla));
        typeGPUTesla.click();
        wait.until(ExpectedConditions.visibilityOf(selectAmountGPU));
        //wait.withTimeout(Duration.ofSeconds(3));
        selectAmountGPU.sendKeys(machine.getSelectAmountGPU());
        wait.until(ExpectedConditions.visibilityOf(amountLocalSSD));
        amountLocalSSD.click();
        wait.until(ExpectedConditions.visibilityOf(amountLocalSSD));
        amount0LocalSSD.click();
        wait.until(ExpectedConditions.visibilityOf(amountLocalSSD));
        amount0LocalSSD.sendKeys(machine.getAmountLocalSSD());
        wait.until(ExpectedConditions.visibilityOf(usageBox));
        usageBox.click();
        wait.until(ExpectedConditions.visibilityOf(usageBox));
        usageBox.sendKeys(machine.getUsageYears());
        return machine;
    }
    @Override
    protected AbstractPage openPage() {
        return null;
    }
}
