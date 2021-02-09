package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.ReaderEnvironment;

public class VirtualMachine {
    private String QUANTITY = "number.quantityOfInstance";
    private String AMOUNT_GPU = "number.amountOfGPUs";
    private String AMOUNT_SSD = "number.amountLocalSSD";
    private String USAGE = "number.usageYears";
    private WebElement typeOfGPUs;
    private WebElement selectSeries;
    private WebElement selectN1Series;
    private WebElement selectMachineType;
    private WebElement selectMachineType8;
    private WebElement addingGPU;
    private WebElement selectAmountGPU;
    private WebElement typeOfGPU;
    private WebElement typeGPUTesla;
    WebDriver driver;

    public VirtualMachine(WebDriver driver){this.driver = driver;}
    public String getQuantityOfInstances(){
        return ReaderEnvironment.getInputData(QUANTITY);
    }
    public String getSelectAmountGPU(){ return ReaderEnvironment.getInputData(AMOUNT_GPU); }
    public String getAmountLocalSSD(){
        return ReaderEnvironment.getInputData(AMOUNT_SSD);
    }
    public String getUsageYears(){
        return ReaderEnvironment.getInputData(USAGE);
    }
    public WebElement getTypeOfGPUs(){return typeOfGPUs;}
    public WebElement getSelectSeries(){return selectSeries;}
    public WebElement getSelectN1Series(){return selectN1Series;}
    public WebElement getSelectMachineType(){return selectMachineType;}
    public WebElement getSelectMachineType8(){return selectMachineType8;}
    public WebElement getAddingGPU(){return addingGPU;}
    public WebElement getTypeOfGPU(){return typeOfGPU;}
    public WebElement getTypeGPUTesla(){return typeGPUTesla;}
}
