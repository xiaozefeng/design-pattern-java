package com.gz.abstractfactory;

public class Main {
    public static void main(String[] args) {
        //MobileGameOperationFactory factory = new AndroidMobileGameOperationFactory();
        MobileGameOperationFactory factory = new SymbianMobileGameOperationFactory();
        InterfaceController interfaceController = factory.createInterfaceController();
        OperationController operationController = factory.createOperationController();
        interfaceController.display();
        operationController.display();
    }
}
