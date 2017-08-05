package com.gz.abstractfactory;

public class SymbianMobileGameOperationFactory implements MobileGameOperationFactory {
    @Override
    public OperationController createOperationController() {
        return new SymbianOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterfaceController();
    }
}
