package com.gz.abstractfactory;

/**
 * @author xiaozefeng
 */
public class AndroidMobileGameOperationFactory implements MobileGameOperationFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }

}
