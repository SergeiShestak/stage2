package service;

import model.VirtualMachine;
import util.ReaderEnvironment;

public class VirtualMachineInitializer {

    public  static VirtualMachine virtualMachineInitializer() {
        VirtualMachine machine = new VirtualMachine();
        machine.setFieldInstances(ReaderEnvironment.getInputData("quantityOfInstances"));
        machine.setQuantityOfInstances(ReaderEnvironment.getInputData("number.quantityOfInstance"));
        machine.setFieldSeries(ReaderEnvironment.getInputData("fieldSeries"));
        machine.setSelectSeries(ReaderEnvironment.getInputData("selectSeries"));
        machine.setFieldMachineType(ReaderEnvironment.getInputData("fieldMachineType"));
        machine.setSelectMachineType(ReaderEnvironment.getInputData("selectMachineType"));
        machine.setAddingGPU(ReaderEnvironment.getInputData("addingGPU"));
        machine.setFieldGPU(ReaderEnvironment.getInputData("fieldAmountGPU"));
        machine.setAmountOfGPUs(ReaderEnvironment.getInputData("number.amountOfGPUs"));
        machine.setFieldTypeOfGPU(ReaderEnvironment.getInputData("typeOfGPU"));
        machine.setSelectTypeGPU(ReaderEnvironment.getInputData("typeGPUTesla"));
        machine.setFieldLocalSSD(ReaderEnvironment.getInputData("fieldLocalSSD"));
        machine.setSelectAmount0LocalSSD(ReaderEnvironment.getInputData("amountLocalSSD"));
        machine.setAmountLocalSSD(ReaderEnvironment.getInputData("number.amountLocalSSD"));
        machine.setUsageBox(ReaderEnvironment.getInputData("usageBox"));
        machine.setUsageYears(ReaderEnvironment.getInputData("number.usageYears"));
        return machine;
    }
}
