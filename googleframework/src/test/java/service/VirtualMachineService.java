package service;

import model.VirtualMachine;
import pages.CalculatorPage;

public class VirtualMachineService {
    public void createVirtualMachine (VirtualMachine machine){
        new CalculatorPage()
                .openPage()
                .instanceSelection(machine.getFieldInstances(),machine.getQuantityOfInstances())
                .openSeriesSelection(machine.getFieldSeries())
                .seriesSelection(machine.getSelectSeries())
                .openMachineTypeSelection(machine.getFieldMachineType())
                .machineTypeSelection(machine.getSelectMachineType())
                .addGPU(machine.getAddingGPU())
                .amountGPUSelection(machine.getFieldGPU(), machine.getAmountOfGPUs())
                .openTypeOfGPUSelection(machine.getFieldTypeOfGPU())
                .typeOfGPUSelect(machine.getSelectTypeGPU())
                .openLocalSSDSelection(machine.getFieldLocalSSD())
                .localSSDSelection(machine.getSelectAmount0LocalSSD())
                .selectAmountLocalSSD(machine.getFieldLocalSSD(),machine.getAmountLocalSSD())
                .openUsageSelection(machine.getUsageBox())
                .usageSelection(machine.getUsageYears())
                .submitForm();
    }
}
