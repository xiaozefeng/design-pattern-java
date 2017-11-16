package com.gz.abstractfactory;

/**
 * @author xiaozefeng
 */
public interface MobileGameOperationFactory {
    /**
     *
     * @return
     */
    OperationController createOperationController();

    /**
     *
     * @return
     */
    InterfaceController createInterfaceController();
}
