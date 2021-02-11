package service;

import model.VirtualMachine;
import pages.CalculatorPage;

public class VirtualMachineService {
    public void createVirtuallMachine (VirtualMachine machine){

         new CalculatorPage()
                 .openPage()
                 .instanceSelection(machine.getFieldInstances(),machine.getQuantityOfInstances())
                 .submitForm();
    }
}
