package com.gz.abstractfactory;

public interface MobileGameOperationFactory {
    OperationController createOperationController();

    InterfaceController createInterfaceController();
}
